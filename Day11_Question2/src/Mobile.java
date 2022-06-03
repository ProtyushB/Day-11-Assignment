public class Mobile {

    String[] outdatedModels = {"note4","note5","note6","note7"};

    public void searchOutdatedModel(String...args){
        for (String items:args){
            boolean flag=false;
            for (int i=0;i<outdatedModels.length;i++){
                if(items.equals(outdatedModels[i])){
                    flag=true;
                    break;
                }
            }
            if(flag){
                System.out.println(items+"_OUTDATED");
            }
        }
    }

    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        mobile.searchOutdatedModel("S21","note4","S22","note7");
    }
}
