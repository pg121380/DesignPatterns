package behavior.chain;

public class Manager extends Leader {
        public Manager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        if (leaveRequest.getLeaveDays() >= 3 && leaveRequest.getLeaveDays() < 10){
            System.out.println("员工" + leaveRequest.getEmpName() + "的请假已被审批。" + " ----" + this.name);
        } else {
            System.out.println("请假天数太多");
        }
    }
}
