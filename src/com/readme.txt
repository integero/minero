                Попытка выполнить задание task.PNG

Main.java                       class with main method
PreGame.java                    preparation for game for current interface
Game.java                       main logic of game

common
    Cell.java
    CellImages.java
    FieldOfGame.java
    GaI.java                    announcing of interfaces
    GaM.java                    common methods
    GaP.java                    common game parameters
    USA.java                    coordinates & action in the step of game

console
    ConsoleUserChoice.java      choice of coordinates & action & set them to USA
    ConsoleUserRequest.java     asking user for game parameters & step choice
    ConsoleView.java            send image of gameField to console

gui                             components for GUI interface
    GuiLaunch.java              GUI environment LAUNCH
    GuiObj.java                 initiation of GUI components
    GuiUserChoice.java          choice of coordinates & action & set them to USA
    GuiUserRequest.java         asking user for game parameters
    GuiView.java                send image of gameField to GUI

interfaces
    IUserChoice.java            player choice
    IUserRequest.java           communication with the player
    IViewField.java             visualization of the game field

resource                        images for GUI cells
    1.jpg
    2.jpg
    3.jpg
    4.jpg
    5.jpg
    6.jpg
    7.jpg
    8.jpg
    9.jpg
    bigMine.jpg
    exploited.jpg
    flag.jpg
    open.jpg
    notOpen.jpg
    smallMine.jpg               for future
