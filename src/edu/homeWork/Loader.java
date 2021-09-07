package edu.homeWork;

public class Loader implements LoadingUnloading {
    private String name;
    private int branchId;

    public Loader(String name, int branchId) {
        this.name = name;
        this.branchId = branchId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    @Override
    public boolean sorting(Box box, SmallStorage branches, BigStorage bigStorage) {//определение размера блока
        int size = box.getSize();
        if (size<branches.getCELLSIZE()){
             branches.setBox(box);
            return true;
        }else if (size<bigStorage.getCELLSIZE()){
            bigStorage.setBox(box);
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Box[] addBox(Box box) {
     //   for (int i = 0;i<;i++)
        return null;
    }
}
