public class Doctor {
    int id;
    String Dname,DHosp,DNum,DTime,DAdd,DSpec,DDay;

    public Doctor() {
    }

    public Doctor(int id, String Dname, String DHosp, String DNum, String DTime, String DAdd, String DSpec, String DDay) {
        this.id = id;
        this.Dname = Dname;
        this.DHosp = DHosp;
        this.DNum = DNum;
        this.DTime = DTime;
        this.DAdd = DAdd;
        this.DSpec = DSpec;
        this.DDay = DDay;
     
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDname() {
        return Dname;
    }

    public void setDname(String Dname) {
        this.Dname = Dname;
    }
    public String getDHosp() {
        return DHosp;
    }

    public void setDHosp(String DHosp) {
        this.DHosp = DHosp;
    }

    public String getDNum() {
        return DNum;
    }

    public void setDNum(String DNum) {
        this.DNum = DNum;
    }

    public String getDTime() {
        return DTime;
    }

    public void setDTime(String DTime) {
        this.DTime = DTime;
    }

    public String getDAdd() {
        return DAdd;
    }

    public void setDAdd(String DAdd) {
        this.DAdd = DAdd;
    }

    public String getDSpec() {
        return DSpec;
    }

    public void setDSpec(String DSpec) {
        this.DSpec = DSpec;
    }

  
    public String getDDay() {
        return DDay;
    }

    public void setDDay(String DDay) {
        this.DDay = DDay;
    }
  }
