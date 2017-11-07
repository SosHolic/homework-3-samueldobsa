package sk.holic.sos;

public class Test extends  GeneralTest {


    public Test ref;
    public static Test sref;
    public int val;
    public static int calc(){
        Test t1 = new Test();
        Test t2 = new Test();
        t1.ref = t2;
        t1.sref = t1;
        t1.val = 1;
        t2.ref = t1;
        t2.sref = t2;
        t2.val = 1;

        return t1.sref.ref.ref.val + t1.sref.ref.ref.val + t2.ref.sref.ref.val;

        }


        public int getCount () {
            return 3;
        }
        public static void main(String[] args){
            Test test = new Test();
            int count = test.getCount();
            GeneralTest generalTest = new Test();
            count += generalTest.getCount();
            generalTest = new GeneralTest();
            count += generalTest.getCount();

            System.out.println(count);
        }

    }


