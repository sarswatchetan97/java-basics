enum Status {
    Running, Failed, Success, Pending;
}

public class EnumDemo {
    public static void main(String[] args) {
//        Status s[] = Status.values();
//        for (Status status : s) {
//            System.out.println(status);
//        }
        Status s = Status.Running;
//        if (s == Status.Success) {
//            System.out.println("Done");
//        } else if (s == Status.Running) {
//            System.out.println("In Progress");
//        } else if (s == Status.Failed) {
//            System.out.println("Try Again!!");
//        } else {
//            System.out.println("Wait");
//        }
        switch(s) {
            case Success -> {
                System.out.println("Done");
                break;
            }
            case Running -> {
                System.out.println("In Progress");
                break;
            }
            case Failed -> {
                System.out.println("Try Again!!");
                break;
            }
            default -> System.out.println("Wait");
        }

     }
}