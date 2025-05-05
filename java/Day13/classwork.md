#Create Statement 
  * SELECT query 
  * Insert query

#Prepared Statement 
*SELECT quere(marks > ? ) ( Scan the marks --> get marks (resultset))   
 String sql = "SELECT * FROM students WHERE marks > ?";

#calling stored-Procedures
* preparecall(con) 
* call sp_getstudents(?) 
* call sp_getmarks(?,?) 
  

#Transaction managment 
*SELECT @@autocommit
*set autocommit = 1 
*ROLLBACK 
##con.setAutoCommit(false);
con.commit();



#Movies class : - id(int) , title(String) , rating(double)
*writeMovies(); (for-each) 
*readMovies(); (creating the list and add)(while--true)
List<Movie> list = new ArrayList<>();
list.add(new Movie(1, "Star Wars", 7.5));
list.add(new Movie(2, "Godfather", 8.0));
list.add(new Movie(3, "Hidden Figures", 7.0));
list.add(new Movie(4, "Bruce Almighty", 6.5));
list.add(new Movie(5, "Forest Gump", 8.5));

## demo01 - Data streams
* DataOutputStream
* DataInputStream

## demo02 - Object streams 
* ObjectOutputStream
* ObjectInputStream
* Serializable, serialVersionUID

## demo03 - Buffered streams
* BufferedOutputStream
* BufferedInputStream

## demo04 - PrintStream
* formatted output

## demo05 - Reader/Writer
* Character encoding i.e. Charset , print size 
* FileReader
* FileWriter
* FileInputStream , InputStreamReader(for Reading) 
* FileWriter 
* FileOutputStream , OutputStreamWriter (for writing) 


##menudriven code 


