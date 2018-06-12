package com.company;

public class Main {

    public static void main(String[] args) {
	 for (DocStatus docSt : DocStatus.values()){
         System.out.println("Name = " + docSt.name() + ", statusCode = " + docSt.getStatusCode());
     }
        System.out.println(DocStatus.NEW);
        System.out.println(DocStatus.ARCHIVED);

        DocStatus docSt = DocStatus.ARCHIVED;
        System.out.println(switchDocSt(docSt));

    }
    public static String switchDocSt(DocStatus docSt){
        switch (docSt){
            case ARCHIVED:
               return ("Switched to ARCHIVED");
            case PUBLISHED:
                return("Switched to PUBLISHED");
            default:
                return("Default");
        }
    }
    enum DocStatus{
        NEW(31) {
            public String toString() {return "I'm NEW";}
        },
        DRAFT(23),
        PUBLISHED(52),
        ARCHIVED(77);

        private int statusCode;

        private DocStatus (int statusCode){
            this.statusCode = statusCode;
        }
        public int getStatusCode(){
            return statusCode;
        }
    }
}
