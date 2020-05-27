int y=0;
int randomNumber=0;
int score=0;
    void checkCatch(int x){
         if (x > mouseX-50 && x < mouseX+50)
            score++;
         else if (score > 0) 
            score--;
        println("Your score is now: " + score);
    }
void draw(){
    if(y==500){
   y=0;
     randomNumber = (int) random(0,500);
    
     
   
   
    
    }
    if (y==450){
      checkCatch(randomNumber);}
  
  background(255,255,255);
  fill(0,0,255);
  stroke(1,1,100,100);
  ellipse(randomNumber,y,25,100);
  y+=10;
   
  ellipse(randomNumber,y,25,100);
  fill(100,100,100);
  rect( mouseX-50, 400, 100,100);
 fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
  }

void setup(){
  size(500,500);
  
}
