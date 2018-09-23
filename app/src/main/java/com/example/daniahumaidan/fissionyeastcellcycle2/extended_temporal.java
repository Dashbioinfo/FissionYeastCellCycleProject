package com.example.daniahumaidan.fissionyeastcellcycle2;

import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;

public class extended_temporal extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extended_temporal);
        final Intent choicesIntent = getIntent();
        /*if (choicesIntent==null){
            Toast.makeText(getApplicationContext(),"it is null",Toast.LENGTH_LONG).show();
        }*/

        if (choicesIntent.hasExtra("choices")) {
            Bundle extras = choicesIntent.getExtras();
            int[] choices = extras.getIntArray("choices");
            StringBuilder builder = new StringBuilder();
            for (int i : choices) {
                builder.append(i);
            }
            String text = builder.toString();

            //Toast.makeText(getApplicationContext(),getApplicationContext().getResources().getResourceEntryName(R.id.imageView4),Toast.LENGTH_LONG).show(); GETS THE ID
            edit_network(text);
        }
        Button button_Run = (Button) findViewById(R.id.button_Run);
        button_Run.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View v) {
                                              ImageView StartStatus = (ImageView) findViewById(R.id.imageView26);
                                              ImageView Ste9Status = (ImageView) findViewById(R.id.imageView30);
                                              ImageView Rum1Status = (ImageView) findViewById(R.id.imageView28);
                                              ImageView Wee1Status = (ImageView) findViewById(R.id.imageView33);
                                              StartStatus.setImageResource(android.R.drawable.button_onoff_indicator_on);
                                              Ste9Status.setImageResource(android.R.drawable.button_onoff_indicator_on);
                                              Rum1Status.setImageResource(android.R.drawable.button_onoff_indicator_on);
                                              Wee1Status.setImageResource(android.R.drawable.button_onoff_indicator_on);
                                              ImageView Sep1Status = (ImageView) findViewById(R.id.sep1imgVi);
                                              ImageView Fkh2Status = (ImageView) findViewById(R.id.fkh2imgVi);
                                              ImageView Atf1Status = (ImageView) findViewById(R.id.atf1imgVi);
                                              Sep1Status.setImageResource(android.R.drawable.button_onoff_indicator_off);
                                              Fkh2Status.setImageResource(android.R.drawable.button_onoff_indicator_off);
                                              Atf1Status.setImageResource(android.R.drawable.button_onoff_indicator_off);
                                              final Drawable dOn = StartStatus.getDrawable();
                                              TextView phase = (TextView) findViewById((R.id.textView5));
                                              String string1 = getString(R.string.START);
                                              phase.setText(string1);
                                              //activate_genes(offD);
                                              final String choic;
                                              if (choicesIntent.hasExtra("choices")) {
                                                  Bundle extras = choicesIntent.getExtras();
                                                  int[] choices = extras.getIntArray("choices");
                                                  StringBuilder builder = new StringBuilder();
                                                  for (int i : choices) {
                                                      builder.append(i);
                                                  }
                                                  choic = builder.toString();
                                              }
                                              else{
                                                  choic="111";
                                              }
                                              Switch pauseSwitch = (Switch) findViewById(R.id.switchPause);
                                              final Handler handler = new Handler();
                                              if (!pauseSwitch.isChecked()) {
                                                  handler.postDelayed(new Runnable() {
                                                      @Override
                                                      public void run() {

                                                          stp2(dOn,choic);
                                                      }
                                                  }, 3000);
                                              } else {
                                                  pauseSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                                      public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                                          if (isChecked == false) {
                                                              handler.postDelayed(new Runnable() {
                                                                  @Override
                                                                  public void run() {

                                                                      stp2(dOn, choic);
                                                                  }
                                                              }, 3000);
                                                          }
                                                      }
                                                  });
                                              }
                                          }
                                      }
        );

    }

    public void goToEdit(View view) {
        Intent intent = new Intent(this, EditActivity.class);
        startActivity(intent);
        finish();
    }

    public void stp2(final Drawable dOn, final String text) {
        activate_genes(dOn, text);
        //String phs=find_phase(i);
        TextView phase = (TextView) findViewById((R.id.textView5));
        String phs = getString(R.string.G1);
        phase.setText(phs);
        final Handler handler2 = new Handler();
        Switch pauseSwitch = (Switch) findViewById(R.id.switchPause);
        if (!pauseSwitch.isChecked()) {
            handler2.postDelayed(new Runnable() {
                @Override
                public void run() {

                    stp3(dOn, text);
                }
            }, 3000);
        } else {
            pauseSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (!isChecked) {
                        handler2.postDelayed(new Runnable() {
                            @Override
                            public void run() {

                                stp3(dOn, text);
                            }
                        }, 3000);
                    }
                }
            });
        }
    }

    public void stp3(final Drawable dOn, final String text) {
        activate_genes(dOn, text);
        TextView phase = (TextView) findViewById((R.id.textView5));
        String phs = getString(R.string.G1S);
        phase.setText(phs);
        final Handler handler3 = new Handler();
        Switch pauseSwitch = (Switch) findViewById(R.id.switchPause);
        if (!pauseSwitch.isChecked()) {
            handler3.postDelayed(new Runnable() {
                @Override
                public void run() {

                    stp4(dOn, text);
                }
            }, 3000);
        } else {
            pauseSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked == false) {
                        handler3.postDelayed(new Runnable() {
                            @Override
                            public void run() {

                                stp4(dOn, text);
                            }
                        }, 3000);
                    }
                }
            });
        }
    }

    public void stp4(final Drawable dOn, final String text) {
        activate_genes(dOn, text);
        TextView phase = (TextView) findViewById((R.id.textView5));
        String phs = getString(R.string.G2);
        phase.setText(phs);
        final Handler handler4 = new Handler();
        Switch pauseSwitch = (Switch) findViewById(R.id.switchPause);
        if (!pauseSwitch.isChecked()) {
            handler4.postDelayed(new Runnable() {
                @Override
                public void run() {

                    stp5(dOn, text);
                }
            }, 3000);
        } else {
            pauseSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked == false) {
                        handler4.postDelayed(new Runnable() {
                            @Override
                            public void run() {

                                stp5(dOn, text);
                            }
                        }, 3000);
                    }
                }
            });
        }
    }

    public void stp5(final Drawable dOn, final String text) {
        activate_genes(dOn, text);
        TextView phase = (TextView) findViewById((R.id.textView5));
        String phs = getString(R.string.G2);
        phase.setText(phs);
        final Handler handler5 = new Handler();
        Switch pauseSwitch = (Switch) findViewById(R.id.switchPause);
        if (!pauseSwitch.isChecked()) {
            handler5.postDelayed(new Runnable() {
                @Override
                public void run() {

                    stp6(dOn, text);
                }
            }, 3000);
        } else {
            pauseSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked == false) {
                        handler5.postDelayed(new Runnable() {
                            @Override
                            public void run() {

                                stp6(dOn, text);
                            }
                        }, 3000);
                    }
                }
            });
        }
    }

    public void stp6(final Drawable dOn, final String text) {
        activate_genes(dOn, text);
        TextView phase = (TextView) findViewById((R.id.textView5));
        String phs = getString(R.string.G2M);
        phase.setText(phs);
        final Handler handler6 = new Handler();
        Switch pauseSwitch = (Switch) findViewById(R.id.switchPause);
        if (!pauseSwitch.isChecked()) {
            handler6.postDelayed(new Runnable() {
                @Override
                public void run() {

                    stp7(dOn, text);
                }
            }, 3000);
        } else {
            pauseSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked == false) {
                        handler6.postDelayed(new Runnable() {
                            @Override
                            public void run() {

                                stp7(dOn, text);
                            }
                        }, 3000);
                    }
                }
            });
        }
    }

    public void stp7(final Drawable dOn, final String text) {
        activate_genes(dOn, text);
        TextView phase = (TextView) findViewById((R.id.textView5));
        String phs = getString(R.string.G2M);
        phase.setText(phs);
        final Handler handler7 = new Handler();
        Switch pauseSwitch = (Switch) findViewById(R.id.switchPause);
        if (!pauseSwitch.isChecked()) {
            handler7.postDelayed(new Runnable() {
                @Override
                public void run() {

                    stp8(dOn, text);
                }
            }, 3000);
        } else {
            pauseSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked == false) {
                        handler7.postDelayed(new Runnable() {
                            @Override
                            public void run() {

                                stp8(dOn, text);
                            }
                        }, 3000);
                    }
                }
            });
        }
    }

    public void stp8(final Drawable dOn, final String text) {
        activate_genes(dOn, text);
        TextView phase = (TextView) findViewById((R.id.textView5));
        String phs = getString(R.string.M);
        phase.setText(phs);
        final Handler handler8 = new Handler();
        Switch pauseSwitch = (Switch) findViewById(R.id.switchPause);
        if (!pauseSwitch.isChecked()) {
            handler8.postDelayed(new Runnable() {
                @Override
                public void run() {

                    stp9(dOn, text);
                }
            }, 3000);
        } else {
            pauseSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked == false) {
                        handler8.postDelayed(new Runnable() {
                            @Override
                            public void run() {

                                stp9(dOn, text);
                            }
                        }, 3000);
                    }
                }
            });
        }
    }

    public void stp9(final Drawable dOn, final String text) {
        activate_genes(dOn, text);
        TextView phase = (TextView) findViewById((R.id.textView5));
        String phs = getString(R.string.M);
        phase.setText(phs);
        final Handler handler9 = new Handler();
        Switch pauseSwitch = (Switch) findViewById(R.id.switchPause);
        if (!pauseSwitch.isChecked()) {
            handler9.postDelayed(new Runnable() {
                @Override
                public void run() {

                    stp10(dOn, text);
                }
            }, 3000);
        } else {
            pauseSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked == false) {
                        handler9.postDelayed(new Runnable() {
                            @Override
                            public void run() {

                                stp10(dOn, text);
                            }
                        }, 3000);
                    }
                }
            });
        }
    }

    public void stp10(final Drawable dOn, final String text) {
        activate_genes(dOn, text);
        TextView phase = (TextView) findViewById((R.id.textView5));
        String phs = getString(R.string.G1);
        phase.setText(phs);
    /*    Switch pauseSwitch=  (Switch) findViewById(R.id.switchPause);
        if (!pauseSwitch.isChecked()){
        final Handler handler10= new Handler();
        handler10.postDelayed(new Runnable() {
            @Override
            public void run() {
                stp11(dOn);
            }
        }, 3000);
 }*/
    }

    public void stp11(final Drawable dOn, final String text) {
        //activate_genes();
        ImageView StartStatus = (ImageView) findViewById(R.id.imageView26);
        ImageView Ste9Status = (ImageView) findViewById(R.id.imageView30);
        ImageView Rum1Status = (ImageView) findViewById(R.id.imageView28);
        ImageView Wee1Status = (ImageView) findViewById(R.id.imageView33);
        StartStatus.setImageResource(android.R.drawable.button_onoff_indicator_on);
        Ste9Status.setImageResource(android.R.drawable.button_onoff_indicator_on);
        Rum1Status.setImageResource(android.R.drawable.button_onoff_indicator_on);
        Wee1Status.setImageResource(android.R.drawable.button_onoff_indicator_on);
        TextView phase = (TextView) findViewById((R.id.textView5));
        String string1 = getString(R.string.START);
        phase.setText(string1);
        final Handler handler11 = new Handler();
        handler11.postDelayed(new Runnable() {
            @Override
            public void run() {
                stp2(dOn, text);
            }
        }, 3000);
    }

    public void activate_genes(Drawable dOn, String choicesText) {
        ImageView StartStatus = (ImageView) findViewById(R.id.imageView26);
        ImageView Cig1Cdc2Status = (ImageView) findViewById(R.id.imageView24);
        ImageView Cig2Cdc2Status = (ImageView) findViewById(R.id.cycle);
        ImageView Puc1Cdc2Status = (ImageView) findViewById(R.id.imageView27);
        ImageView Ste9Status = (ImageView) findViewById(R.id.imageView30);
        ImageView Rum1Status = (ImageView) findViewById(R.id.imageView28);
        ImageView Wee1Status = (ImageView) findViewById(R.id.imageView33);
        ImageView Slp1Status = (ImageView) findViewById(R.id.imageView32);
        ImageView Cdc25Status = (ImageView) findViewById(R.id.imageView31);
        ImageView PPStatus = (ImageView) findViewById(R.id.imageView35);
        ImageView Cdc2TyrStatus = (ImageView) findViewById(R.id.imageView34);
        ImageView Cdc2Cdc13Status = (ImageView) findViewById(R.id.imageView29);
        ImageView Sep1Status = (ImageView) findViewById(R.id.sep1imgVi);
        ImageView Fkh2Status = (ImageView) findViewById(R.id.fkh2imgVi);
        ImageView Atf1Status = (ImageView) findViewById(R.id.atf1imgVi);


        Drawable dStart = StartStatus.getDrawable();
        Drawable dCig1Cdc2 = Cig1Cdc2Status.getDrawable();
        Drawable dCig2Cdc2 = Cig2Cdc2Status.getDrawable();
        Drawable dPuc1Cdc2 = Puc1Cdc2Status.getDrawable();
        Drawable dSte9 = Ste9Status.getDrawable();
        Drawable dRum1 = Rum1Status.getDrawable();
        Drawable dWee1 = Wee1Status.getDrawable();
        Drawable dSlp1 = Slp1Status.getDrawable();
        Drawable dCdc25 = Cdc25Status.getDrawable();
        Drawable dPP = PPStatus.getDrawable();
        Drawable dCdc2Tyr = Cdc2TyrStatus.getDrawable();
        Drawable dCdc2Cdc13 = Cdc2Cdc13Status.getDrawable();
        Drawable dSep1 = Sep1Status.getDrawable();
        Drawable dFkh2 = Fkh2Status.getDrawable();
        Drawable dAtf1 = Atf1Status.getDrawable();

        Integer valStart = convertToValues(dOn, dStart);
        Integer valCig1Cdc2 = convertToValues(dOn, dCig1Cdc2);
        Integer valCig2Cdc2 = convertToValues(dOn, dCig2Cdc2);
        Integer valPuc1Cdc2 = convertToValues(dOn, dPuc1Cdc2);
        Integer valSte9 = convertToValues(dOn, dSte9);
        Integer valRum1 = convertToValues(dOn, dRum1);
        Integer valWee1 = convertToValues(dOn, dWee1);
        Integer valSlp1 = convertToValues(dOn, dSlp1);
        Integer valCdc25 = convertToValues(dOn, dCdc25);
        Integer valPP = convertToValues(dOn, dPP);
        Integer valCdc2Tyr = convertToValues(dOn, dCdc2Tyr);
        Integer valCdc2Cdc13 = convertToValues(dOn, dCdc2Cdc13);
        Integer valSep1 = convertToValues(dOn, dSep1);
        Integer valFkh2 = convertToValues(dOn, dFkh2);
        Integer valAtf1 = convertToValues(dOn, dAtf1);

        int resStart = -valStart;
        update_state(resStart, StartStatus, 0);
        int resSK = valStart - valCig1Cdc2;
        update_state(resSK, Cig1Cdc2Status, 0);
        update_state(resSK, Cig2Cdc2Status, 0);
        update_state(resSK, Puc1Cdc2Status, 0);
        int resSte9 = -valCig1Cdc2 - valCig2Cdc2 - valPuc1Cdc2 - valCdc2Cdc13 + valPP;
        update_state(resSte9, Ste9Status, 0);
        int resRum1 = 0;
        //checking if the phase is M
        if (valCdc2Cdc13 == 1 && valCdc2Tyr == 1 && valCdc25 == 1 && valSlp1 == 1) {
            resRum1 = -valCig1Cdc2 - valCig2Cdc2 - valPuc1Cdc2 - valCdc2Cdc13 + valPP + valSep1 + valFkh2;
        } else {
            resRum1 = -valCig1Cdc2 - valCig2Cdc2 - valPuc1Cdc2 - valCdc2Cdc13 + valPP;
        }
        update_state(resRum1, Rum1Status, 0);
        int resCdc25 = +valCdc2Cdc13 - valPP;
        update_state(resCdc25, Cdc25Status, 0);
        int resPP = +valSlp1 - valPP;
        update_state(resPP, PPStatus, 0);
        int resWee1 = -valCdc2Cdc13 + valPP;
        update_state(resWee1, Wee1Status, 0);
        int resSlp1 = +valCdc2Cdc13 + valCdc2Tyr - valSlp1;
        update_state(resSlp1, Slp1Status, 1);
        int resCdc2Cdc13 = 0;
        if (valCdc2Cdc13 == 1 && valCdc2Tyr == 0 && valCdc25 == 1) {
            resCdc2Cdc13 = -valRum1 - valSte9 - valSlp1 + valAtf1;
        } else {
            resCdc2Cdc13 = -valRum1 - valSte9 - valSlp1;
        }
        update_state(resCdc2Cdc13, Cdc2Cdc13Status, -0.5);
        int resCdc2Tyr = -valWee1 + valCdc25;
        update_state(resCdc2Tyr, Cdc2TyrStatus, 0.5);
        String [] chars=choicesText.split("(?!^)");
        int resAtf1 = act_deact(Integer.parseInt(String.valueOf(chars[2])))*valCdc2Cdc13;
        int resFkh2 = act_deact(Integer.parseInt(String.valueOf(chars[1])))*valCdc2Cdc13;
        int resSep1 = act_deact(Integer.parseInt(String.valueOf(chars[0])))*valCdc2Cdc13;
        //checking the next phase whether it is G2/M
        if (valCdc2Cdc13 == 1 && valCdc2Tyr == 0 && valCdc25 == 1) {
            update_state(resSep1, Sep1Status, 0);
            update_state(resAtf1, Atf1Status, 0);
        }
        //checking the next phase whether it is G1/S
        if (valCig1Cdc2 == 1 && valCig2Cdc2 == 1 && valPuc1Cdc2 == 1) {
            update_state(1, Fkh2Status, 0); // cdc2/cdc13 is active but its level is ntot high enough to be written as 1
        }
    }

    public int convertToValues(Drawable a, Drawable b) {
        if (b.getConstantState() == a.getConstantState()) {
            return 1;
        } else {
            return 0;
        }
    }

    public void update_state(int res, ImageView imv, double thresh) {
        if (res > thresh) {
            imv.setImageResource(android.R.drawable.button_onoff_indicator_on);
        } else if (res < thresh) {
            imv.setImageResource(android.R.drawable.button_onoff_indicator_off);
        }
    }

    public String find_phase(int i) {
        String phase = "";
        switch (i) {
            case '1':
            case '9':
                phase = getString(R.string.G1);
                break;
            case '2':
                phase = getString(R.string.G1S);
                break;
            case '3':
            case '4':
                phase = getString(R.string.G2);
                break;
            case '5':
            case '6':
                phase = getString(R.string.G2M);
                break;
            case '7':
            case '8':
                phase = getString(R.string.M);
                break;
        }
        return phase;
    }

    public void edit_network(String st) {
        ImageView imgToChange = (ImageView) findViewById(R.id.imageView4);
        switch (st) {
            case "000":
                imgToChange.setImageResource(R.drawable.offoffoff);
                break;
            case "001":
                imgToChange.setImageResource(R.drawable.offoffon);
                break;
            case "010":
                imgToChange.setImageResource(R.drawable.offonoff);
                break;
            case "011":
                imgToChange.setImageResource(R.drawable.offonon);
                break;
            case "100":
                imgToChange.setImageResource(R.drawable.onoffoff);
                break;
            case "101":
                imgToChange.setImageResource(R.drawable.onoffon);
                break;
            case "110":
                imgToChange.setImageResource(R.drawable.ononoff);
                break;
            case "111":
                imgToChange.setImageResource(R.drawable.ononon);
                break;
        }
    }

    public int act_deact(int a){
        if (a==1){
            return 1;
        }
        else{
            return -1;
        }
    }



}