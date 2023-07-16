public class genetic {

    public static int minTick = 1000;
    public void genetic(){
        run run = new run();
        int runTick = run.run();
        System.out.println(runTick);
        if(minTick > runTick){
            minTick = runTick;
            while (minTick > runTick){

                // 변이
                for (int key : DataSlot.startSequence3.keySet()){
                    String value = DataSlot.startSequence3.get(key);
                    int modifiedKey = key;
                    if (Math.random() <= 0.001){
                        modifiedKey = (int) (Math.random() * 100) * 300;
                    }
                    DataSlot.startSequence3.remove(key);
                    DataSlot.startSequence3.put(modifiedKey,value);
                }
                for (int key : DataSlot.startSequence2.keySet()){
                    String value = DataSlot.startSequence2.get(key);
                    int modifiedKey = key;
                    if (Math.random() <= 0.001){
                        modifiedKey = (int) (Math.random() * 100) * 300;
                    }
                    DataSlot.startSequence2.remove(key);
                    DataSlot.startSequence2.put(modifiedKey,value);
                }
                for (int key : DataSlot.startSequence1.keySet()){
                    String value = DataSlot.startSequence1.get(key);
                    int modifiedKey = key;
                    if (Math.random() <= 0.001){
                        modifiedKey = (int) (Math.random() * 100) * 300;
                    }
                    DataSlot.startSequence1.remove(key);
                    DataSlot.startSequence1.put(modifiedKey,value);
                }
            }
        }
        System.out.println(runTick);
        log.saveFile();
        log.logBuilder = new StringBuilder();
    }
}
