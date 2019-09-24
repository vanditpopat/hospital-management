public class patient {
int pid;
String padd,pname,problem,pnum;

    public patient() {
    }

    public patient(int pid, String padd, String pname, String problem, String pnum) {
        this.pid = pid;
        this.padd = padd;
        this.pname = pname;
        this.problem = problem;
        this.pnum = pnum;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPadd() {
        return padd;
    }

    public void setPadd(String padd) {
        this.padd = padd;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getPnum() {
        return pnum;
    }

    public void setPnum(String pnum) {
        this.pnum = pnum;
    }


}
