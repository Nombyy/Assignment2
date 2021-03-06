/*

The WESPath class.  An WESPath object has three ends.

*/

class WESPath extends SwitchPath {

  public WESPath(GridLoc loc, Map T) {
    super(new Direction("west"), new Direction("east"), new Direction("south"), loc, T);
    setLoc(loc);
    startAngle = 0;
  }

  public WESPath(Map T) {
    super(new Direction("west"), new Direction("east"), new Direction("south"), T);
    startAngle = 0;
  }

  public void setLoc(GridLoc loc) {
    super.setLoc(loc);
    x1 = 0.0;
    y1 = 0.5;
    x2 = 1.0;
    y2 = 0.5;
    x3 = -0.5;
    y3 = 0.5;
  }

  public String toString() {
    return "WESPath";
  };
}
