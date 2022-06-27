import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
	
  PImage imgCharacter;
	PImage imgCone;
  PImage imgCream;
  PImage imgPlatformLeft;
  PImage imgPlatformMid;
  PImage imgPlatformRight;

  int intObjectX = 280;
  int intObjectY = 250;
  int intObjectSpeed = 3;
  
  int intRandom = (int) random(width);
  int intCreamX;
  int intCreamY;

  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(560, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {

    imgCharacter = loadImage("Player_Character.png");
    imgCharacter.resize(imgCharacter.width/2, imgCharacter.height/2);
    imgCone = loadImage("Cone_Base.png");
    imgCone.resize(imgCone.width * 2/3, imgCone.height * 2/3);
    imgCream = loadImage("creamVanilla.png");
    imgPlatformLeft = loadImage("cakeHalfAltLeft.png");
    imgPlatformMid = loadImage("cakeHalfAltMid.png");
    imgPlatformRight = loadImage("cakeHalfAltRight.png");
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    
    background(143, 224, 242);

  	//draw images to screen
  	image(imgPlatformLeft, 0, height-imgPlatformLeft.height/2);
    image(imgPlatformMid, 70, height-imgPlatformMid.height/2);
    image(imgPlatformMid, 140, height-imgPlatformMid.height/2);
    image(imgPlatformMid, 210, height-imgPlatformMid.height/2);
    image(imgPlatformMid, 280, height-imgPlatformMid.height/2);
    image(imgPlatformMid, 350, height-imgPlatformMid.height/2);
    image(imgPlatformMid, 420, height-imgPlatformMid.height/2);
    image(imgPlatformRight, 490, height-imgPlatformRight.height/2);
    image(imgCharacter, intObjectX - imgCharacter.width/2, intObjectY);
    image(imgCone, intObjectX - imgCone.width/2, intObjectY);
  
    PlayerMovement();
    FallingBlocks();
  }
  
  public void PlayerMovement() {
    if(keyPressed){
      if(key == 'a'){
        intObjectX -= intObjectSpeed;
      }

      else if(key == 'd'){
        intObjectX += intObjectSpeed;
      }
    }
  }

  public void FallingBlocks() {
    
    image(imgCream, intRandom, intCreamY);
    intCreamY += 1;
  

    if (intObjectX == intRandom && intObjectY == intCreamY) {
      intCreamX = intObjectX;
      intCreamY = intObjectY;
    }
  }
}