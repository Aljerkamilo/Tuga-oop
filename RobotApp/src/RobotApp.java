import java.util.Scanner;

public class RobotApp {
    public static void main(String[] args){
        new RobotApp();
    }

    /*
     * Perintah Soal:
     * Anggap 'o' adalah sebuah robot yang berada didalam area permainan.
     * Buat robot dapat bergerak ke kiri/kanan/atas/bawah sesuai jumlah langkah yang diinstruksikan.
     * Format instruksi: {d=kanan/a=kiri/w=atas/s=bawah}{jumlah langkah} dan 'x' untuk keluar aplikasi *case sensitive
     * Robot tidak boleh keluar dari area permainan dan buat pesan kesalahannya.
     * Buat pesan kesalahan jika pengguna tidak menulis instruksi dengan benar.
     * Lanjut pada perintah soal dibawah.
     */

    private Layout layout;
    private Robot robot;
    private Scanner scanner;
    public RobotApp() {
        // contoh konfigurasi (inisiasi object layout) area permainan: X = 10, Y = 10, icon area yang tidak ditempati robot adalah '*'
        this.layout = new Layout(10, 10, '*');
        this.scanner = new Scanner(System.in);
        String instruction = "";

        Position startPosition = new Position(0, 0);
        this.robot = new Robot('o', startPosition);

        System.out.println("-------- Permainan Dimulai --------");
        do{
            draw();
            instruction = waitInstruction();
            if(instruction.equals("x")){//agar ketika input "x" tidak akan dilakukan pemrosesan terhadap x, karena jika "x" diproses akan salah
                break;
            }
            prosesInstruksi(instruction);//tambahan method untuk memproses perpindahan robot berdasarkan instruction
        }while(!instruction.equals("x"));
        System.out.println("-------- Permainan Selesai --------");
    }
    
    private String waitInstruction() {
        System.out.println("-------- Instruksi --------");
        System.out.println("Instruksi: {d=kanan/a=kiri/w=atas/s=bawah}{jumlah langkah}");
        System.out.println("Contoh: w3 berarti 'keatas 3 langkah'");
        System.out.print("Masukan instruksi: ");
        return scanner.nextLine();
    }

    private void prosesInstruksi(String instruksi){

        char arah = instruksi.charAt(0);//mendapatkan arah d/w/a/s
        int stepsInt = Integer.parseInt(instruksi.substring(1));

        int x= robot.getPosition().getX();
        int y= robot.getPosition().getY();


        switch (arah) {
            case 'd':
                x+=stepsInt;
                break;
            case 'a':
                x-=stepsInt;
                break;
            case 'w':
                y-=stepsInt;
                break;
            case 's':
                y+=stepsInt;
                break;
            default:
                System.out.println("Instruksi tidak valid silahkan coba lagi.");
                break;
        }

        if(x>=layout.getMaxX()||y>=layout.getMaxY()||x<0||y<0){
            System.out.println("Robot keluar dari area permainan");
        }else{
            robot.setPosition(new Position(x, y));
        }
    }
    
    private void draw() {
        System.out.println("------ Posisi Terbaru ------");

        int x= robot.getPosition().getX();
        int y= robot.getPosition().getY();

        char[][] area = layout.getArea();
        for(int i=0;i<layout.getMaxY();i++){//kolom
            for(int j=0;j<layout.getMaxX();j++){//baris
                if(x==j && y==i){
                    System.out.print(robot.getIcon());
                }else{
                    System.out.print(area[i][j]);
                }
            }
            System.out.println();
        }
        //
    
        /*
        Gambar layout:
        Contoh:
        - Posisi robot di 1,1
        - Area permainan luasnya 10,10
        sehingga gambar layout akan menjadi:

            o*********
            **********
            **********
            **********
            **********
            **********
            **********
            **********
            **********
            **********

            - konfigurasi (icon robot, posisi robot, luas area dan icon area permainan yang tidak ditempati robot) silahkan gunakan prinsip OOP
            - icon cukup menggunakan karakter yang ada di keyboard.
         */

    }
}

