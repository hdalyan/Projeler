private String ilkHali;

userTxt.setOnKeyListener((view, i, keyEvent) -> {
            if (keyEvent.getAction() == KeyEvent.ACTION_DOWN) {
                if (KeyEvent.KEYCODE_COMMA == keyEvent.getKeyCode()) {
                    ilkHali = ((EditText) view).getText().toString();
                }
            }
            if (keyEvent.getAction() == KeyEvent.ACTION_UP) {
                if (KeyEvent.KEYCODE_COMMA == keyEvent.getKeyCode()) {
                    String yeniHali = ((EditText) view).getText().toString();
                    if (ilkHali.contains(",")) {

                        int SelectionPoint = ((EditText) view).getSelectionStart() - 1;
                        StringBuilder txt = new StringBuilder();
                        for (int j = 0; j < yeniHali.length(); j++) {
                            if (j == SelectionPoint) {
                                txt.append(",");
                            } else if (yeniHali.charAt(j) != ',') {
                                txt.append(yeniHali.charAt((j)));
                            }
                        }

                        ((EditText) view).setText(txt.toString());
                        ((EditText) view).setSelection(SelectionPoint);
                    }
                }
            }
            return false;
        });

