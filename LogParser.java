/*
 * Copyright 2021 Marc Liberatore.
 */

package log;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.Vector;
public class LogParser 
{	
	
	public static List<SuspectEntry> parseLog(Reader r) throws IOException {
            List<SuspectEntry> list=new ArrayList<SuspectEntry>();
            BufferedReader reader=new BufferedReader(r);
            String words[];
            String line;
            while((line=reader.readLine())!=null)
            {
                words=line.split(",");
                list.add(new SuspectEntry(words[0],words[1],words[2]));
            }
            SuspectEntry arr[]=new SuspectEntry[list.size()];
            for(int i=0;i<list.size();i++)
                arr[i]=list.get(i);
            return Arrays.asList(arr);
	}
	public static List<SuspectEntry> findCommonEntries(List<List<SuspectEntry>> entryLists) 
	{
            
            List<SuspectEntry> resultList=new ArrayList<SuspectEntry>();
            List<SuspectEntry> firstList=null;
            if(entryLists==null || entryLists.size()==0)
                return Arrays.asList();
            firstList=entryLists.get(0);
            for(int i=0;i<firstList.size();i++)
            {
                boolean existInAll=true;
                Vector<Integer> vector=new Vector<Integer>();
                for(int a=1;a<entryLists.size();a++)
                {
                    boolean existInList=false;
                    for(int b=0;b<entryLists.get(a).size();b++)
                    {
                        if(entryLists.get(a).get(b).getPassportNumber().equals(firstList.get(i).getPassportNumber()))
                        {
                            vector.add(b);
                            existInList=true;
                            break;
                        }
                    }
                    if(!existInList)
                    {
                        existInAll=false;
                        break;
                    }
                }
                if(existInAll)
                {
                        resultList.add(firstList.get(i));                        
                        for(int a=1;a<entryLists.size();a++)
                        {
                            boolean existAlready=false;
                            for(int b=0;b<resultList.size();b++)
                            {
                                if(resultList.get(b).equals(entryLists.get(a).get(vector.get(a-1))))
                                {
                                    existAlready=true;
                                    break;
                                }
                            }
                            if(!existAlready)
                                resultList.add(entryLists.get(a).get(vector.get(a-1)));
                        }
                    
                }
            }
            Collections.sort(resultList,new SuspectEntry());
            return resultList;
	}
}