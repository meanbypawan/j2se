class J5{
  public void receivingCall(){
    System.out.println("call received...");
  }
  public void rejectingCall(){
    System.out.println("call rejected...");
  }
}
class J7 extends J5{
  public void camera(){
    System.out.println("Camera called....");
  }
}
class J11 extends J7{
  public void bluetooth(){
    System.out.println("Bluetooth called....");
  }
}
class TestMain{
  public static void main(String args[]){
     J11 j11 = new J11();
     j11.receivingCall();
     j11.rejectingCall();
     j11.camera();
     j11.bluetooth();
  }
}
