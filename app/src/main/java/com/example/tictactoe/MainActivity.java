package com.example.tictactoe;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.viewmodel.CreationExtras;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    ImageButton img_btn;
    String b1, b2, b3, b4, b5, b6, b7, b8, b9;
    int flag = 0;
    int counter = 0;
    ArrayList<Integer> mainList;
    ArrayList<Integer> positiveList;
    ArrayList<Integer> negativeList;
    ArrayList<Integer> winBoard;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        init();
        img_btn.setVisibility(View.INVISIBLE);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void init()
    {
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        img_btn = findViewById(R.id.img_btn_win);

        mainList = new ArrayList<Integer>();
        List<Integer> itemsToAdd = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        mainList.addAll(itemsToAdd);

        positiveList = new ArrayList<Integer>();
        negativeList = new ArrayList<Integer>();
        winBoard = new ArrayList<Integer>();
    }

    public void Check(View view)
    {
        Button currentButton = (Button) view;

        if(currentButton.getText().equals(""))
        {
            handleButtonWithFlagAndId(currentButton);

            /**
            if(flag == 0)
            {
                currentButton.setText("YOU");
                currentButton.setBackgroundColor(getResources().getColor(R.color.green));
                flag = 1;
                counter++;
            }
            else
            {
                currentButton.setText("X");
                currentButton.setBackgroundColor(getResources().getColor(R.color.red));
                flag = 0;
                counter++;
            }
             */

            if(counter > 4)
            {
                b1 = btn1.getText().toString();
                b2 = btn2.getText().toString();
                b3 = btn3.getText().toString();
                b4 = btn4.getText().toString();
                b5 = btn5.getText().toString();
                b6 = btn6.getText().toString();
                b7 = btn7.getText().toString();
                b8 = btn8.getText().toString();
                b9 = btn9.getText().toString();

                if(b1.equals(b2) && b2.equals(b3) && !b1.isEmpty())
                {
                    //1
                    //Toast.makeText(this, "You Win!", Toast.LENGTH_SHORT).show();
                    //reset();
                    disableAllButton();
                    img_btn.setVisibility(View.VISIBLE);
                }
                else if(b4.equals(b5) && b5.equals(b6) && !b4.isEmpty())
                {
                    //2
                    //Toast.makeText(this, "You Win!", Toast.LENGTH_SHORT).show();
                    //reset();
                    disableAllButton();
                    img_btn.setVisibility(View.VISIBLE);
                }
                else if(b7.equals(b8) && b8.equals(b9) && !b7.isEmpty())
                {
                    //3
                    //Toast.makeText(this, "You Win!", Toast.LENGTH_SHORT).show();
                    //reset();
                    disableAllButton();
                    img_btn.setVisibility(View.VISIBLE);
                }
                else if(b1.equals(b4) && b4.equals(b7) && !b1.isEmpty())
                {
                    //4
                    //Toast.makeText(this, "You Win!", Toast.LENGTH_SHORT).show();
                    //reset();
                    disableAllButton();
                    img_btn.setVisibility(View.VISIBLE);
                }
                else if(b2.equals(b5) && b5.equals(b8) && !b2.isEmpty())
                {
                    //5
                    //Toast.makeText(this, "You Win!", Toast.LENGTH_SHORT).show();
                    //reset();
                    disableAllButton();
                    img_btn.setVisibility(View.VISIBLE);
                }
                else if(b3.equals(b6) && b6.equals(b9) && !b3.isEmpty())
                {
                    //6
                    //Toast.makeText(this, "You Win!", Toast.LENGTH_SHORT).show();
                    //reset();
                    disableAllButton();
                    img_btn.setVisibility(View.VISIBLE);
                }
                else if(b1.equals(b5) && b5.equals(b9) && !b1.isEmpty())
                {
                    //7
                    //Toast.makeText(this, "You Win!", Toast.LENGTH_SHORT).show();
                    //reset();
                    disableAllButton();
                    img_btn.setVisibility(View.VISIBLE);
                } else if(b3.equals(b5) && b5.equals(b7) && !b3.isEmpty())
                {
                    //8
                    //Toast.makeText(this, "You Win!", Toast.LENGTH_SHORT).show();
                    //reset();
                    disableAllButton();
                    img_btn.setVisibility(View.VISIBLE);
                }
            }
        }
    }

    private void reset_func()
    {
        flag = 0;
        counter = 0;
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        img_btn.setVisibility(View.INVISIBLE);
        resetButtonBackgroundColor();
    }

    private void resetButtonBackgroundColor()
    {
        btn1.setBackgroundColor(getResources().getColor(R.color.btnColor));
        btn2.setBackgroundColor(getResources().getColor(R.color.btnColor));
        btn3.setBackgroundColor(getResources().getColor(R.color.btnColor));
        btn4.setBackgroundColor(getResources().getColor(R.color.btnColor));
        btn5.setBackgroundColor(getResources().getColor(R.color.btnColor));
        btn6.setBackgroundColor(getResources().getColor(R.color.btnColor));
        btn7.setBackgroundColor(getResources().getColor(R.color.btnColor));
        btn8.setBackgroundColor(getResources().getColor(R.color.btnColor));
        btn9.setBackgroundColor(getResources().getColor(R.color.btnColor));
    }

    public void Reset(View view)
    {
        reset_func();
        enableAllButton();
    }

    private void disableAllButton()
    {
        flag = 0;
        counter = 0;
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
    }

    private void enableAllButton()
    {
        flag = 0;
        counter = 0;
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
    }

    private void userButtonAction(Button btn)
    {
        btn.setText("YOU");
        btn.setBackgroundColor(getResources().getColor(R.color.green));
    }

    private void oppositeButtonAction(Button btn)
    {
        btn.setText("X");
        btn.setBackgroundColor(getResources().getColor(R.color.red));
    }

    private void handleButtonWithFlagAndId(Button currentButton)
    {
        if(flag == 0 && currentButton.getId() == R.id.btn1)
        {
            userButtonAction(btn1);
            oppositeButtonAction(btn3);
            positiveList.add(1);
            negativeList.add(3);
            mainList.remove(Integer.valueOf(1));
            mainList.remove(Integer.valueOf(3));
            flag++;
        }
        else if(flag == 0 && currentButton.getId() == R.id.btn2)
        {
            userButtonAction(btn2);
            oppositeButtonAction(btn6);
            positiveList.add(2);
            negativeList.add(6);
            mainList.remove(Integer.valueOf(2));
            mainList.remove(Integer.valueOf(6));
            flag++;
        }
        else if(flag == 0 && currentButton.getId() == R.id.btn3)
        {
            userButtonAction(btn3);
            oppositeButtonAction(btn5);
            positiveList.add(3);
            negativeList.add(5);
            mainList.remove(Integer.valueOf(3));
            mainList.remove(Integer.valueOf(5));
            flag++;
        }
        else if(flag == 0 && currentButton.getId() == R.id.btn4)
        {
            userButtonAction(btn4);
            oppositeButtonAction(btn2);
            positiveList.add(4);
            negativeList.add(2);
            mainList.remove(Integer.valueOf(4));
            mainList.remove(Integer.valueOf(2));
            flag++;
        }
        else if(flag == 0 && currentButton.getId() == R.id.btn5)
        {
            userButtonAction(btn5);
            oppositeButtonAction(btn3);
            positiveList.add(5);
            negativeList.add(3);
            mainList.remove(Integer.valueOf(5));
            mainList.remove(Integer.valueOf(3));
            flag++;
        }
        else if(flag == 0 && currentButton.getId() == R.id.btn6)
        {
            userButtonAction(btn6);
            oppositeButtonAction(btn8);
            positiveList.add(6);
            negativeList.add(8);
            mainList.remove(Integer.valueOf(6));
            mainList.remove(Integer.valueOf(8));
            flag++;
        }
        else if(flag == 0 && currentButton.getId() == R.id.btn7)
        {
            userButtonAction(btn7);
            oppositeButtonAction(btn4);
            positiveList.add(7);
            negativeList.add(4);
            mainList.remove(Integer.valueOf(7));
            mainList.remove(Integer.valueOf(4));
            flag++;
        }
        else if(flag == 0 && currentButton.getId() == R.id.btn8)
        {
            userButtonAction(btn8);
            oppositeButtonAction(btn1);
            positiveList.add(8);
            negativeList.add(1);
            mainList.remove(Integer.valueOf(8));
            mainList.remove(Integer.valueOf(1));
            flag++;
        }
        else if(flag == 0 && currentButton.getId() == R.id.btn9)
        {
            userButtonAction(btn9);
            oppositeButtonAction(btn2);
            positiveList.add(9);
            negativeList.add(2);
            mainList.remove(Integer.valueOf(9));
            mainList.remove(Integer.valueOf(2));
            flag++;
        }
        else if(flag == 1 && currentButton.getId() == R.id.btn1)
        {
            userButtonAction(btn1);
            if(btn5.getText() == "")
            {
                oppositeButtonAction(btn5);
            }
            else if(btn3.getText() == "")
            {
                oppositeButtonAction(btn3);
            }
            else if(btn7.getText() == "")
            {
                oppositeButtonAction(btn7);
            }
            else if(btn7.getText() == "")
            {
                oppositeButtonAction(btn7);
            }

            positiveList.add(9);
            negativeList.add(2);
            mainList.remove(Integer.valueOf(9));
            mainList.remove(Integer.valueOf(2));
            flag++;
        }

    }
}