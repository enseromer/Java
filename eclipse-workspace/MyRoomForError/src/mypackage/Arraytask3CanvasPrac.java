package mypackage;
import java.util.*;
public class Arraytask3CanvasPrac {
	public static void main(String[] args) {
		
		
		
		String[] courses = {
				"Welcome Kit",
				"Online-Java Programming",
		    	"Online-Software Development Lifecycle",
		    	"Online-Software QA Testing",
		    	"Online-Team Activity",
		    	"Online-Mentoring", 
		    	"Online-Selenium",
		    	"Online-SQL",
		    	"Online-API Testing"
				} ;
	int[] courseId = {143,166,168,170,163,203,169,171,164} ; 
	
	
	// use above 2 array to generate below message.
	// course ID for <Welcome Kit> is <143>
	
	for(int i=0;i<9;i++)
		System.out.println("<"+courses[i]+"> is <"+courseId[i]+">");
//	
//	 for(int i=0; courses.length>i; i++) {
//         System.out.println(courses[i]+" is : "+courseId[i]);
//	 }
         
//         for (int j=0; j<courses.length;j++ ) {
//     		
//     		if(courses[j].equals("Online-Java Programming"))
//     			System.out.println(courseId[j]);
     		
     	
     
//         for(int x=0; x<courseId.length;x++) {
//     		
//     		if(courseId[x]==203 ) {
////     			System.out.println(courses[x]);
//     		}
//     		}
//         for (int i = 0; i < courses.length; i++) {
//				if(courseId[i]==203) {
//		
//		System.out.println(courses[i]);
//				}
//         }
       //find out course name of 203
//     	for (int i = 0; i < courseId.length; i++) {
//     		int eachCoursesId =courseId[i];
//      		 
//     		if(eachCoursesId== 203 ) {
//     			System.out.println("203  Course name is "+ courses[i]);
//     			break;
//     		}
//     	}
//     	int count=0;
//    	for(int i=0; i<courses.length;i++) {
//    		
//    		if(courses[i].contains("Software")) {
//    			
//    			count++;
//    		}
//    		System.out.println(count);
    	}
	}

