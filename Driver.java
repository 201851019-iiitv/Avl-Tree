package avltree;
import java.util.Scanner;
public class Driver {
	    public static void main(String[] args){
	        AvlTree avl=new AvlTree();
	        Scanner scan=new Scanner(System.in);
	        while(true){
	            System.out.println("1>>INSERT");
	            System.out.println("2>>print inorder");
	            System.out.println("3>>search and delete from avl tree");
	            switch (scan.nextInt()){
	                case 1:
	                    avl.insert(scan.nextInt());
	                    break;
	                case 2:
	                    avl.inorder();
	                    break;
	                case 3:avl.delete(scan.nextInt());
	                break;
	                    default:
	                        System.out.println("sorry wrong option");
	            }
	        }
	    }
	}

