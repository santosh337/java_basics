Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        
        int bSlice = b/2;
        int cSlice = c/4;
        
        int sum = 7 * Math.min(a, Math.min(b / 2, c / 4));
        
        System.out.println(sum);
