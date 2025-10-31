class  ProgramFactory  {

    public ProgramFactory(){}
  public Program  creatProgram(int num){
    if(num==1){
        return new Program1();
    }
    if(num==2){
        return new Program2();
    }
    if(num==3){
        return new Program3();
    }
  }
}

