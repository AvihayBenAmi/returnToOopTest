package org.example;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static Object main(String[] args) {

        //טיפול בחריגות
        try {
            //enter your code here
        } catch (NullPointerException e) { //Exception for example
            e.printStackTrace(); //מדפיס את השתלשלות החריגה
            e.getMessage(); //מדפיס מלל המסביר על החריגה
        }

        //אוספים ואיטרטורים
        ArrayList<Integer> numbers = new ArrayList<>(); //רשימה בצורת מערך עבור יותר חיפושים במקום שינויים
        List<Integer> numbers2 = new ArrayList<>(); // עבור שינויים רשימה בצורת מערך
        List<Integer> numbers5 = Arrays.asList(1, 2, 3); // יצירת רשימה עם אתחול פרמטרים בעת יצירתה
        LinkedList<Integer> numbers3 = new LinkedList<>(); //רשימה מקושרת
        HashSet<Integer> numbers4 = new HashSet<>(); //hashSet - ללא כפילויות וללא חשיבות לסדר - אוסף מצורת קבוצה
        numbers.add(value);// מוסיף את הספרה לפי ערך למיקום הראשון שפנוי
        numbers.add(location, value);// מוסיף את הספרה לפי מיקום וערך
        numbers.remove(value);// מסיר איבר מהרשימה לפי ערך
        numbers.remove(location, value);// מוסיף את הספרה לפי מיקום וערך
        numbers.get(location);//מחזיר איבר במקום מסויים ברשימה
        numbers.size();//מחזיר גודל רשימה
        numbers.contains(value);//בודק האם רשימה מכילה איבר מסויים
        numbers.clear();// מחיקת כל האיברים מהקבוצה

        Map<Integer, String> map = new HashMap<>(); //מפה יודעת למפות בין מפתח key חח"ע לבין ערך value
        TreeMap<Integer, String> treeMap = new TreeMap<>(); //מפה ממויינת על פי המפתחות שלה
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>(); //הסדר של האיברים נקבע על פי ההכנסה שלהם
        map.put(key, value); //מוסיף למפה צמד key-value
        map.get(key); //שליפת ערך לפי מפתח
        map.remove(key, value); //מסיר מפתח וערך מהמפה (אפשר רק ערך או רק מפתח)
        map.containsKey(key);//בודקת האם הkey נמצא במפה
        map.containsValue(value);// בודקת האם הערך נמצא במפה
        map.size();//מחזירה את גודל המפה
        map.isEmpty();// בדיקה האם המפה ריקה

        for (String name : names) {
        }//לולאת for-each עוברת על הset לפי הסדר שנקבע עבורו ולא פועלת על פי אינדקס ולא ניתן להסיר באמצעותה איברים

        Iterator<String> iterator = names.iterator(); //שימוש באיטרטור מאפשר לנו לקבל את האיבר הבא באוסף
        while (iterator.hasNext()) { //בודקת האם יש לאיבר הנוכחי איבר הבא
            String value = iterator.next();
            if (value.equals(toRemove)) { //מאפשרת גם מחיקת איברים
                iterator.remove();
            }
        }
        ListIterator<String> listIterator = name.listIterator();
        iterator.next() //מתקדם צעד אחד באוסף
        Iterator.previous // הולך צעד אחורה באוסף

        //קבצים
        // קובץ txt טקסט פשוט ולא מאובטח
        // קובץ bin קובץ בינארי מאובטח וניתן לתחזוקה רק באמצעות קוד

        //יצירת קובץ
        File file = new File(path)//הצהרה על משתנה מסוג קובץ המקבל את הנתיב
        try {
            boolean success = file.createNewFile();//יוצר את הקובץ ומחזיר תשובה אם נוצר בהצלחה או לא או חריגה
        } catch (IOException e) {
            e.printStackTrace();
        }
        //כתיבה לקובץ - פרימטביים ומחרוזות לטקסט, אובייקטים לבינארי
        //כתיבה לקובץ טקסט
        public static void writeToFile (File file, String data){
            try {
                if (file != null && file.exists()) { //בודק האם הקובץ קיים ומוצהר
                    FileWriter fileWriter = new FileWriter(file); //יוצר משתנה filewriter
                    fileWriter.write(data); //כותב
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); //מאפשר חלוקת כתיבה לקובץ בנתחים
                    bufferedWriter.write(data);
                    bufferedWriter.close();
                    fileWriter.close(); //סוגר את הקובץ


                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //כתיבה לקובץ בינארי
        public class example implements Serializable {
        }//המחלקה צריכה לרשת בשביל סריאליזציה
        public static void writeToObjectFile (Object object, File file){
            try {
                if (file != null && file.exists()) { //בודק האם הקובץ קיים ומוצהר
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                    objectOutputStream.writeObject(object);
                    objectOutputStream.close();
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //קריאה מקובץ טקסט
        public static List<String> reafFromFile (File file) throws Exception {
            List<String> lines = new ArrayList<>();
            try {
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line = null;
                do {
                    line = bufferedReader.readLine();
                    lines.add(line);
                } while (line != null);
                finally{
                    if (bufferedReader != null)
                        bufferedReader.close();
                    if (fileReader != null)
                        fileReader.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return lines;
        }
        //קריאה מקובץ בינארי
        public static Object readObjectFromFile (File file){
            Object object = null;
            try {
                if (file != null && file.exists()) {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                    object = (Object) objectInputStream.readObject();
                    objectInputStream.close();
                    fileInputStream.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return object;
        }

        //שימוש בתהליכונים
        Thread thread=new Thread(()-> {
                //job
    });// יצירת תהליכון עם פונקצייה אנונימית
        //פונקציה אנונימית לא יודעת לעבור עם משתנים שאינם קבועים!
        thread.start();//הפעלת התהליכון

        try {
            Thread.sleep(5000);//עוצר ל5 שניות
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            thread.wait(); //ממתין עד שיקרה משהו
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread.notify();//מחזיר ממצב wait לrunnable

        public class Example extends Thread{
            @Override
            public void run() {
                //job
            }

            //מימוש
            Example example=new Example();
            example.start();
        }//מחלקה שיורשת מThread מאפשרת לייצר תהליכונים ללא בעיית הפונקציה האנונימית
        public class Example2 implements Runnable{
            @Override
            public void run() {
                //מחלקה הממשת ממשק runnable מאפשרת להחליט האם להריץ את הjob כתהליכון נפרד או באופן טורי
            }
        }
        //מימוש
        Example2 example2=new Example2();
        Thread thread=new Thread(example2); //בשימוש ממחלקה שיורשת runnambe אנחנו נצטרך ליצור משתנה מסוג thread
        example2.start();

        //race condition - מרוץ תהליכונים
        // קורה כאשר שני תהליכונים שרצים במקביל משנים יחדיו משאב משותף מקרה כזה יוביל לשוני בפלט מהרצה להרצה
        try {
            thread.join(); // ימתין עד שהתהליכון יסתיים ואז ימשיך הקוד
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //במקרה זה נאתר את קטע הקוד הקריטי ונגדיר syncronize
        public synchronized void method (){
            this.criticalParameter +=sum;
        }

        //בעיית יצרן צרכן - כאשר שני תהליכונים תלויים אחד בעבודתו של השני
        //נשתמש במתודות thrad.wait וthread.notify
        //wait - גורמת לתהליכון הנוכחי להמתין ולא להתקדם לשורות הקוד הבאות עד להתראה
        //notify - ההתראה שמשחררת את וויט ומזומנת ע"י תהליכון אחר

        //בעיית הפילוסופים הסועדים
        //ייתכן וייגרם קיפאון deadlock - אם כל התהליכונים מחזיקים באותו רגע במשאב מסויים הנדרש לפעולה של תהליכון אחר
        //בעיית livelock - אם כל הפילוסופים ירימו יחד את מזלג שמאל ויגלו כולם שמזלג ימין לא פנוי יניחו מיד את מזלג שמאל ואז יגלו שמזלג ימין פנוי וירימו את שמאל וחוזר חלילה

        //תכנות דקלרטיבי
        public List<String> list (List<String> list1){
            return list1.Stream().filter(Client::isMember).map(Client::getName).sorted().collect(Collectors.toList());
        }

        //מתודות ביניים
        //filter - סינון על סמך פונקצייה המועברת
        //map - טרנפורמציה לאמנטים באמצעות פונקציה המועברת
        //flatMap - מפעילה פונקציה על כל איבר בסטרים ומחזירה את התוצאה של הפונקציה כמפה
        //peek - מבצעת פעולה על כל איבר בסטרים ומחזירה אותם
        //distinct - מסירה כפילויות
        //sorted - מבצעת מיון
        //limit - מגבילה תוצאות לאיברים הראשונים שהוגדרו
        //skip - משמיטה את האיברים הראשונים שהוגדרו מהתוצאה

        //מתודות סופיות
        //collect - יצירת סוג מסוים של אוסף כלשהו מהתוצאות שעובדו בסטרים
        //toArray/toList/toMap/toSet - ממירה את האיברים בסטרים למערך
        //forEach - ביצוע פעולה על כל אחד מהאיברים
        //min/max - מחזיר את האיבר באוסף עם הערך הגבוה ביותר או הנמוך ביותר
        //count - מחזירה את מספר האיברים באוסף
        //reduce(Integer::sum).orElse(0) - מקבצת את האיבברים ומחזירה ערך יחיד
        //anyMatch - בודקת האם תנאי מסויים מתקיים על לפחות אחד מהאיברים בסטרים
        //allMatch - בודקת האם תנאי מסויים מתקיים על כל האיברים בסטרים
        //noneMatch - בודקת אם אף אחד מהאיברים אינו מתאים לתנאי מסויים
        //findFirst - מביאה את האיבר הראשון בסטרים
        //findAny - מביאה איבר כלשהו בסטרים

        IntStream.range(0,100) //מעבר על כל המספרים מ0 ל-100

        //קיבוץ
        public Map<String,List<Object>> byExample (List<Object> list){
            return list.stream().collect(Collectors.groupingBy(Object::getSomething));
        }

        //תהליכון בstream
        object.parallelStream();
        //נוודא שהפעולות נטולות state ונשתמש רק במשתנים מקומיים
        //נוודא שהפעולות לא מסירים אלמנטים תוך כדי העיבוד - אם יש צורך ליצור stram ביניים על ידי מתודות ביניים

        //שימוש בgenerics
        //נועד עבור פעולות זהות ביסודן אשר צריכות לקבל כל פעם נתונים שונים
        //רלוונטי כאשר האיבורים המוכנסים חייבים להיות מאותו טיפוס של האיבר המוחזר
        public <T> T methodName (List<T> list, T item){ //כך תראה מתודה גנרית
            //do something
            return something
        } //הזימון של מתודה זו הוא כרגיל ואין צורך בcasting

        public class nameClass <T>{ //מחלקה גנרית, כל טיפוס שניצור מסוג מסויים ממחלקה זו יחליף את T לסוג הרצוי
            //states and methods
        }







    }
}