class Tree {
  private String treeName;
  private String treeType;
  private boolean leavesFall;
  private String leafColor; 
  
  Tree () {
    treeName = "";
    treeType = "";
    leavesFall = false;
    leafColor = "";
  }

  Tree (String aTreeName, String aTreeType, boolean aLeavesFall, String aLeafColor) {
    treeName = aTreeName;
    treeType = aTreeType;
    leavesFall = aLeavesFall;
    leafColor = aLeafColor;
  }

  void setTreeName(String theTreeName) {
    treeName = theTreeName;
  }
  void setTreeType(String theTreeType) {
    treeType = theTreeType;
  }
  void setLeavesFall(boolean theLeavesFall) {
    leavesFall = theLeavesFall;
  }
  void setLeafColor(String theLeafColor) {
    leafColor = theLeafColor;
  }
  String getTreeName() {
    return treeName;
  }
  String getTreeType() {
    return treeType;
  }
  String getLeavesFall() {
    if (leavesFall == false) {
      return "does not";
    }else {
      return "does";
    }
  }
  String getLeafColor() {
    return leafColor;
  }

  void print() {
    System.out.println("This is a " + getTreeName() + " tree. It is a " + getTreeType() + " and its leaves are currently " + getLeafColor() + ". It " + getLeavesFall() + " lose its leaves for the winter.");

  }
}