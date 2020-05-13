 PImage pictureOfRecord;  
 import ddf.minim.*;             //at the very top of your sketch
Minim minim;        //as a member variable
  AudioPlayer song;      //as a member variable
   int angle;
  void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
    }
void setup(){
                       //as member variable
        size(825,825);                                 //in setup method
        pictureOfRecord= loadImage("record.png");      //in setup method
          pictureOfRecord.resize(825,825);     //in setup method
   minim = new Minim(this);    //in the setup method
  song = minim.loadFile("awesomeTrack.mp3", 512);   //in the setup method
}
void draw(){
  angle=angle+100;
   rotateImage(pictureOfRecord, angle);
   image(pictureOfRecord, 0, 0);  //in draw method
}
