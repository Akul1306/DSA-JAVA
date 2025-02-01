public class FCFS{
    public static void main(String[] args) {
        int[] arrivalTime = {0,0,0,0,0} ;
        int[] burstTime = {4, 3, 1, 2, 3};
        int n = arrivalTime.length;

        int[] waitingTime = new int[n];
        int[] turnAroundTime = new int[n];

        waitingTime[0] = 0;
        turnAroundTime[0] = burstTime[0];

        for (int i = 1; i < n; i++) {
            waitingTime[i] = turnAroundTime[i - 1] - arrivalTime[i];
            if (waitingTime[i] < 0) {
                waitingTime[i] = 0;
                turnAroundTime[i] = waitingTime[i] + burstTime[i];
            }
        }
        float sumWaiting=0;float sumTAT = 0;
        for(int i = 0; i < n; i++){
            sumWaiting = sumWaiting + waitingTime[i];
            sumTAT = sumTAT + turnAroundTime[i];
        }
        float avgTime = sumWaiting / n;
        float avgTurnAroundTime = sumTAT / n;

        System.out.println("Process\tArrival\tBurst\tWaiting\tTurnaround");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "\t\t" + arrivalTime[i] + "\t\t" + burstTime[i] + "\t\t" + waitingTime[i] + "\t\t"
                    + turnAroundTime[i]);
        }
        System.out.println("Average Waiting time: " + avgTime);
        System.out.println("Average Turn Around time: " + avgTurnAroundTime);
    }
}