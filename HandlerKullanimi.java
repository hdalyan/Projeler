//Farkı thread üzerinden Main thread'e erişmek
Runnable r1 = new Runnable() {
        @Override
        public void run() {
            try {
                for (int i = 0; i < 1000; i++) {
                    final int abc = i;
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            txt1.setText("Sayı " + String.valueOf(abc));

                        }
                    },1000);
                    Thread.sleep(1000);
                }
            } catch (Exception e) {
                Log.e("Hata", e.getMessage());
            }
        }
    };



new Handler(Looper.getMainLooper()).post(new Runnable() {
                        @Override
                        public void run() {

                            txt1.setText("Sayı " + String.valueOf(abc));

                        }
                    });




new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            txt1.setText("Sayı " + String.valueOf(abc));

                        }
                    },1000);

