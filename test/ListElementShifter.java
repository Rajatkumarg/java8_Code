package test;

import java.util.List;
import java.util.ArrayList;

public class ListElementShifter {

    public static void main(String[] args) {
//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//        numbers.add(4);
//        numbers.add(5);
//        numbers.add(6);
//        numbers.add(7);
//        numbers.add(8);
//        numbers.add(9);
//        numbers.add(10);
//        List<Integer> newList = new ArrayList<Integer>();
//        int totalCount=5;
//        int count=0;
//        if(totalCount>0) {
//        for(int i=numbers.size()-1 ; i>=0 ; i--) {
//        	if(numbers.get(i)%2!=0) {
//            	shiftElementToFront(numbers, numbers.get(i));
//            	count = Math.addExact(count, 1);
//            	if(count==totalCount) {
//            		break;
//            	}
//            }
//        	
//            
//        }
    	List<Student> numbers = new ArrayList<Student>();
        numbers.add(new Student(1,"Ram",true));
        numbers.add(new Student(2,"Shyam",true));
        numbers.add(new Student(3,"mohan",false));
        numbers.add(new Student(4,"Sohan",true));
        numbers.add(new Student(5,"Shivam",false));
        numbers.add(new Student(6,"Risha",false));
        numbers.add(new Student(7,"Gautam",true));
        numbers.add(new Student(8,"Shivam",false));
        numbers.add(new Student(9,"Ram",true));
        numbers.add(new Student(10,"Ram",true));
        int totalCount=(int)numbers.stream().filter(s->s.isPinned()).count();
        int count=0;
        if(totalCount>0) {
        for(int i=numbers.size()-1 ; i>=0 ; i--) {
        	if(numbers.get(i).isPinned()) {
        		System.out.println(numbers.get(i));
            	shiftElementToFront(numbers, numbers.get(i));
            	count = Math.addExact(count, 1);
            	++i;
            	if(count==totalCount) {
            		System.out.println("Break");
            		break;
            	}
            }
        	
            
        }
        }
        System.out.println(numbers);
    }

    public static void shiftElementToFront(List<Student> list, Student element) {
        int index = list.indexOf(element);
        if (index != -1) {
            list.remove(index);
            list.add(0, element);
        }
    }
//    public static void shiftElementToFront(List<Integer> list, int element) {
//        int index = list.indexOf(element);
//        if (index != -1) {
//            list.remove(index);
//            list.add(0, element);
//        }
//    }
}