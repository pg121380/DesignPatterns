package behavior.chain;

public class Director extends Leader {

    public Director(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        if (leaveRequest.getLeaveDays() < 3){
            System.out.println("员工" + leaveRequest.getEmpName() + "的请假已被审批。" + " ----" + this.name);
        } else {
            if(this.nextLeader != null){
                this.nextLeader.handleRequest(leaveRequest);
            }
        }
    }
}
