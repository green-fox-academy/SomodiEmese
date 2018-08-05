public class DrawPyramid {
    public static void main(String[] args) {
        int level = 4;

        for (int i = 0; i < level; ++i) {
            for (int j = 0; j < level * 2 - 1; j++) {
                if (j < level - i - 1 || j > level + i - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
                System.out.print("\n");
            }


//            for(int i=0;i<level;i++)
//            {
//                for(int j=0;j<level-i;j++)
//                {
//                    System.out.print(" ");
//                }
//                for(int k=level-i;k<=level;k++)
//                {
//                    System.out.print("*");
//                }
//                for(int k=level-i;k<level;k++)
//                {
//                    System.out.print("*");
//                }
//                for(int j=0;j<level-i;j++)
//                {
//                    System.out.print(" ");
//                }
//
//                System.out.print("\n");
//            }
//        for(int i=0;i<level;i++)
//        {
//            for(int j=0;j<level-i;j++)
//            {
//                System.out.print(" ");
//            }
//            for(int j=0;j<=i;j++)
//            {
//                System.out.print("*");
//            }
//            for(int j=0;j<level-i;j++)
//            {
//                System.out.print(" ");
//            }
//
//            System.out.print("\n");
//        }
        }


