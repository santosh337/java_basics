Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for (int i=n;i>=1;i--) {
            for (int j=i;j>=1;j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int i=2;i<=n;i++) {
            for (int j=i;j>=1;j--) {
                System.out.print("*");
            }
            System.out.println();
        }
