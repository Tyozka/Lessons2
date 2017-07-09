package Lessonse15;

import Lessons8.MyStudent;

import java.util.Arrays;
import java.util.IllegalFormatCodePointException;
import java.util.LinkedList;

/**
 * Created by User on 09.07.2017.
 */
public class HashTable {
    private static final int DEFAULT_TABLE_SIZE = 21;
    private LinkedList[] data ;

    public HashTable() {
        this.data = new LinkedList[DEFAULT_TABLE_SIZE];
    }

    public void put(Object key, Object value){
        if(key == null){
            throw  new IllegalArgumentException("Not null key");
        }

        int index = getHashCode(key);
        Entry entry = new Entry( key, value);

        if(data[index] == null){
            data[index] = new LinkedList();
            data[index].add(entry);
            return;
        }

        for(Object ent : data[index]){
            Entry castEntry = (Entry) ent;// TODO rename;
            if(castEntry.getKey().equals(key)){
                castEntry.setValue(value);
                return;
            }
        }

        data[index].add(entry);

        System.out.println(index);


    }

    public Object get(Object key){
      int index = getHashCode(key);
      if(data[index] == null) return null;

        for(Object ent : data[index]){
            Entry castEntry = (Entry) ent;// TODO rename;
            if(castEntry.getKey().equals(key)){
                return castEntry.getValue();
            }
        }

      return null;
    }



    @Override
    public String toString() {
        return "HashTable{" +
                "table=" + Arrays.toString(data) +
                '}';
    }


    public static void main(String[] args) {
        HashTable hashTable = new HashTable();

        MyStudent ivanov = new MyStudent(1, "Ivanov");

        MyStudent petrov = new MyStudent(2, "Petrov");

        MyStudent sidorov = new MyStudent(3, "Sidorov");


        hashTable.put(ivanov, "192.168.0.1");
        hashTable.put(petrov, "192.168.0.1");
        hashTable.put(sidorov, "0.0.0.0");

        Integer id = 1;
        String surname = "Ivanov";
        MyStudent studentToFinde = new MyStudent(id, surname);

        Object obj =  hashTable.get(studentToFinde );
        System.out.println(obj);
    }

    private int getHashCode(Object key){
        int hashCode = key.hashCode();
        int index = Math.abs(hashCode);
        index = index % DEFAULT_TABLE_SIZE;
        return index;
    }





}