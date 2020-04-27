package com.itlize.service.impl;

import com.itlize.service.NumberChangeService;
import org.springframework.stereotype.Service;
import java.util.*;

@Service("NumberChangeService")
public class NumberChangeServiceImpl  implements NumberChangeService {

    private List<String> changed;

    @Override
    public List<String> change(String phoneNumber) {

        this.changed = new ArrayList<String>();
        // Key board init
        HashMap<String,String[]> maps = new HashMap<String, String[]>();
        maps.put("0", new String[]{"0"});
        maps.put("1", new String[]{"1"});
        maps.put("2", new String[]{"2","A","B","C"});
        maps.put("3", new String[]{"3","D","E","F"});
        maps.put("4", new String[]{"4","G","H","I"});
        maps.put("5", new String[]{"5","J","F","L"});
        maps.put("6", new String[]{"6","M","N","O"});
        maps.put("7", new String[]{"7","P","Q","R","S"});
        maps.put("8", new String[]{"8","T","U","V"});
        maps.put("9", new String[]{"9","W","X","Y","Z"});

        String[] numbers = phoneNumber.split("");

        DFS(maps,numbers, new StringBuilder(""),0);

        return this.changed;
    }

    public void DFS(HashMap<String, String[]> maps, String[] numbers, StringBuilder changeNumber, int index) {
        for (int i=0; i < maps.get(numbers[index]).length; i++) {
//            System.out.println(index);
//            System.out.println(changeNumber.toString());
            if (changeNumber.length() >= 9) {
                this.changed.add(changeNumber.toString()+maps.get(numbers[index])[i]);
//                System.out.println(changeNumber.toString());
            } else{
                DFS(maps,numbers, new StringBuilder(changeNumber.toString()+maps.get(numbers[index])[i]), index+1);
            }
        }
    }


}
