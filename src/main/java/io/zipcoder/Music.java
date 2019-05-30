package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){

        int counterUp = 0;
        int counterDown = 0;


        for (int i = startIndex; i < playList.length ; i++) {
            if (playList[i].equals(selection)) {
                break;
            }
            counterUp++;        }
        for (int i = startIndex; i >= 0; i--) {
            if (playList[i].equals(selection)) {
                break;
            }
            counterDown++;
        }
        if (counterUp > counterDown) {return counterDown;}
        else {return counterUp;}
    }
}
