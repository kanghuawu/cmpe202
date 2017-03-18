
int insertButtomX = 500; 
int insertButtomY = 700;

int turnCrankX =  600;
int turnCrankY = 700;

int ButtomSize = 50;

color hoverColor = color(153);
color baseColor = color(255);
color clickedColor = color(0);

color insertButtomColor = baseColor;
color turnCrankColor = baseColor;

boolean insertButtomOver = false;
boolean turnCrankOver = false;

GumballMachine gumballMachine = new GumballMachine(5);
PImage image;

void setup() 
{
  size(800, 800) ;
  
  smooth() ;
  strokeWeight(3);
  strokeCap(ROUND);
  
  // load font
  PFont font = loadFont("BookAntiqua-48.vlw");
  textFont(font, 32);
  
  // load image
  image = loadImage("gumball.jpg");
  
  // Only draw once
  //noLoop();
  
}

void draw() {
  background(255) ;
  fill(0);  
  text("The Gumball Machine", 250, 60);
  update();
  
  image(image, (width-image.width)/2, (height-image.height)/2);
  textSize(20);
  text(gumballMachine.toString(), 10, 660);
   
  textSize(15);
  text("Insert\nQuarter", insertButtomX, insertButtomY - 25);
  text("Turn\nCrank", turnCrankX, turnCrankY - 25); 
  
  if(insertButtomOver){
    fill(hoverColor);
  }else{
    fill(insertButtomColor);
  }
  rect(insertButtomX, insertButtomY, ButtomSize, ButtomSize);
  
  if(turnCrankOver){
    fill(hoverColor);
  }else{
    fill(turnCrankColor);
  }
  rect(turnCrankX, turnCrankY, ButtomSize, ButtomSize);
  //runTest() ;
  
}

void update() {
  if (overInsertQuaterButtom(insertButtomX, insertButtomY, ButtomSize)) {
    insertButtomOver = true;
    turnCrankOver = false;
  } else if ( overTurnCrankButtom(turnCrankX, turnCrankY, ButtomSize) ) {
    turnCrankOver = true;
    insertButtomOver = false;
  } else {
    insertButtomOver = turnCrankOver = false;
  }
}


boolean overInsertQuaterButtom(int x, int y, int size)  {
  if (mouseX >= x && mouseX <= x+size && 
      mouseY >= y && mouseY <= y+size) {
    return true;
  } else {
    return false;
  }
}

boolean overTurnCrankButtom(int x, int y, int size)  {
  if (mouseX >= x && mouseX <= x+size && 
      mouseY >= y && mouseY <= y+size) {
    return true;
  } else {
    return false;
  }
}

void mousePressed() {
  if (insertButtomOver) {
    insertButtomColor = clickedColor;
    turnCrankColor = baseColor;
    gumballMachine.insertQuarter();
  }else if (turnCrankOver) {
    insertButtomColor = baseColor;
    turnCrankColor = clickedColor;
    gumballMachine.turnCrank();
  }
}


public void runTest() {
  GumballMachine gumballMachine = new GumballMachine(5);
  System.out.println(gumballMachine);
  gumballMachine.insertQuarter();
  gumballMachine.turnCrank();
  System.out.println(gumballMachine);
  gumballMachine.insertQuarter();
  gumballMachine.turnCrank();
  gumballMachine.insertQuarter();
  gumballMachine.turnCrank();
  System.out.println(gumballMachine);
}