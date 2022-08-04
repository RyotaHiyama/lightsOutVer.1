package com.nokopi.lightsout;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashMap;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    final int COL = 5;
    final int ROW = 5;

    ImageView iv[][] = new ImageView[COL][ROW];

    /* HashMap は ImageView の ID（R.id.）と，画像（空欄：-1，〇:0，×:1）のペア*/
    HashMap<Integer, Integer> status = new HashMap<Integer, Integer>();

    int count = 0;
    int x=0,y=1;
    int k = 0;
    TextView tv,tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.textView);
        tv1 = (TextView) findViewById(R.id.textView2);

        tv.setText("タップしてください");


        View.OnClickListener listener = new View.OnClickListener() {
            public void onClick(View view) {
                ImageView iview = (ImageView) view;
                int viewId = iview.getId();

                // random array
                if(count <= 0) {
                    for (int i = 0; i < COL; i++) {
                        for (int j = 0; j < ROW; j++) {
                            // Log.d("debug", "i:" + i + "j:" + j);
                            int Id = iv[i][j].getId();
                            Random rand = new Random();
                            int num = rand.nextInt(2) - 1;
                            if (num == 0) {
                                iv[i][j].setImageResource(R.drawable.circle);
                                status.put(Id, 0);
                            }
                            if (num == -1) {
                                iv[i][j].setImageResource(R.drawable.empty);
                                status.put(Id, -1);
                            }
                        }
                    }
                    count++;
                    // tap action
                }else {
                    // 角
                    if(viewId == iv[0][0].getId() || viewId == iv[0][4].getId() || viewId == iv[4][0].getId()||viewId == iv[4][4].getId()) {
                        if (viewId == iv[0][0].getId()) {
                            if (status.get(viewId) == 0) {
                                iv[0][0].setImageResource(R.drawable.empty);
                                status.put(iv[0][0].getId(), -1);
                            }else {  /*if(status.get(viewId) == -1)*/
                                iv[0][0].setImageResource(R.drawable.circle);
                                status.put(iv[0][0].getId(), 0);
                            }
                            int Id2 = iv[0][1].getId();
                            if (Id2 == iv[0][1].getId()) {
                                if (status.get(Id2) == 0) {
                                    iv[0][1].setImageResource(R.drawable.empty);
                                    status.put(iv[0][1].getId(), -1);
                                } else /*if(status.get(Id2) == -1)*/ {
                                    iv[0][1].setImageResource(R.drawable.circle);
                                    status.put(iv[0][1].getId(), 0);
                                }
                            }
                            int Id3 = iv[1][0].getId();
                            if (Id3 == iv[1][0].getId()) {
                                if (status.get(Id3) == 0) {
                                    iv[1][0].setImageResource(R.drawable.empty);
                                    status.put(iv[1][0].getId(), -1);
                                } else/*(status.get(Id3) == -1)*/ {
                                    iv[1][0].setImageResource(R.drawable.circle);
                                    status.put(iv[1][0].getId(), 0);
                                }
                            }

                        }

                        if (viewId == iv[4][4].getId()) {
                            if (status.get(viewId) == 0) {
                                iv[4][4].setImageResource(R.drawable.empty);
                                status.put(iv[4][4].getId(), -1);
                            }else {
                                iv[4][4].setImageResource(R.drawable.circle);
                                status.put(iv[4][4].getId(), 0);
                            }
                            int Id2 = iv[4][3].getId();
                            if (Id2 == iv[4][3].getId()) {
                                if (status.get(Id2) == 0) {
                                    iv[4][3].setImageResource(R.drawable.empty);
                                    status.put(iv[4][3].getId(), -1);
                                } else {
                                    iv[4][3].setImageResource(R.drawable.circle);
                                    status.put(iv[4][3].getId(), 0);
                                }
                            }
                            int Id3 = iv[3][4].getId();
                            if (Id3 == iv[3][4].getId()) {
                                if (status.get(Id3) == 0) {
                                    iv[3][4].setImageResource(R.drawable.empty);
                                    status.put(iv[3][4].getId(), -1);
                                } else {
                                    iv[3][4].setImageResource(R.drawable.circle);
                                    status.put(iv[3][4].getId(), 0);
                                }
                            }
                        }

                        if (viewId == iv[0][4].getId()) {
                            if (status.get(viewId) == 0) {
                                iv[0][4].setImageResource(R.drawable.empty);
                                status.put(iv[0][4].getId(), -1);
                            } else {
                                iv[0][4].setImageResource(R.drawable.circle);
                                status.put(iv[0][4].getId(), 0);
                            }
                            int Id2 = iv[0][3].getId();
                            if (Id2 == iv[0][3].getId()) {
                                if (status.get(Id2) == 0) {
                                    iv[0][3].setImageResource(R.drawable.empty);
                                    status.put(iv[0][3].getId(), -1);
                                } else {
                                    iv[0][3].setImageResource(R.drawable.circle);
                                    status.put(iv[0][3].getId(), 0);
                                }
                            }
                            int Id3 = iv[1][4].getId();
                            if (Id3 == iv[1][4].getId()) {
                                if (status.get(Id3) == 0) {
                                    iv[1][4].setImageResource(R.drawable.empty);
                                    status.put(iv[1][4].getId(), -1);
                                } else {
                                    iv[1][4].setImageResource(R.drawable.circle);
                                    status.put(iv[1][4].getId(), 0);
                                }
                            }
                        }

                        if (viewId == iv[4][0].getId()) {
                            if (status.get(viewId) == 0) {
                                iv[4][0].setImageResource(R.drawable.empty);
                                status.put(iv[4][0].getId(), -1);
                            } else {
                                iv[4][0].setImageResource(R.drawable.circle);
                                status.put(iv[4][0].getId(), 0);
                            }
                            int Id2 = iv[3][0].getId();
                            if (Id2 == iv[3][0].getId()) {
                                if (status.get(Id2) == 0) {
                                    iv[3][0].setImageResource(R.drawable.empty);
                                    status.put(iv[3][0].getId(), -1);
                                } else {
                                    iv[3][0].setImageResource(R.drawable.circle);
                                    status.put(iv[3][0].getId(), 0);
                                }
                            }
                            int Id3 = iv[4][1].getId();
                            if (Id3 == iv[4][1].getId()) {
                                if (status.get(Id3) == 0) {
                                    iv[4][1].setImageResource(R.drawable.empty);
                                    status.put(iv[4][1].getId(), -1);
                                } else {
                                    iv[4][1].setImageResource(R.drawable.circle);
                                    status.put(iv[4][1].getId(), 0);
                                }
                            }
                        }
                        // 枠の右側と左側
                    }else if(viewId == iv[4][1].getId() || viewId == iv[4][2].getId() || viewId == iv[4][3].getId() ||viewId == iv[0][1].getId() || viewId == iv[0][2].getId() || viewId == iv[0][3].getId()) {
                        if (viewId == iv[4][1].getId() || viewId == iv[4][2].getId() || viewId == iv[4][3].getId()) {
                            x += 4;
                        }
                        if (viewId == iv[x][3].getId()) {
                            y += 2;
                        }
                        if (viewId == iv[x][2].getId()) {
                            y++;
                        }
                        if (viewId == iv[x][y].getId()) {
                            if (status.get(viewId) == 0) {
                                iv[x][y].setImageResource(R.drawable.empty);
                                status.put(iv[x][y].getId(), -1);
                            } else {
                                iv[x][y].setImageResource(R.drawable.circle);
                                status.put(iv[x][y].getId(), 0);
                            }
                            if (x == 0) {
                                int Id2 = iv[x + 1][y].getId();
                                if (Id2 == iv[x + 1][y].getId()) {
                                    if (status.get(Id2) == 0) {
                                        iv[x + 1][y].setImageResource(R.drawable.empty);
                                        status.put(iv[x + 1][y].getId(), -1);
                                    } else {
                                        iv[x + 1][y].setImageResource(R.drawable.circle);
                                        status.put(iv[x + 1][y].getId(), 0);
                                    }
                                }
                            } else if (x == 4) {
                                int Id2 = iv[x - 1][y].getId();
                                if (Id2 == iv[x - 1][y].getId()) {
                                    if (status.get(Id2) == 0) {
                                        iv[x - 1][y].setImageResource(R.drawable.empty);
                                        status.put(iv[x - 1][y].getId(), -1);
                                    } else {
                                        iv[x - 1][y].setImageResource(R.drawable.circle);
                                        status.put(iv[x - 1][y].getId(), 0);
                                    }
                                }
                            }
                            int Id3 = iv[x][y + 1].getId();
                            if (Id3 == iv[x][y + 1].getId()) {
                                if (status.get(Id3) == 0) {
                                    iv[x][y + 1].setImageResource(R.drawable.empty);
                                    status.put(iv[x][y + 1].getId(), -1);
                                } else {
                                    iv[x][y + 1].setImageResource(R.drawable.circle);
                                    status.put(iv[x][y + 1].getId(), 0);
                                }
                            }

                            int Id4 = iv[x][y - 1].getId();
                            if (Id4 == iv[x][y - 1].getId()) {
                                if (status.get(Id4) == 0) {
                                    iv[x][y - 1].setImageResource(R.drawable.empty);
                                    status.put(iv[x][y - 1].getId(), -1);
                                } else {
                                    iv[x][y - 1].setImageResource(R.drawable.circle);
                                    status.put(iv[x][y - 1].getId(), 0);
                                }
                            }
                        }
                        y = 1;
                        if (viewId == iv[4][1].getId() || viewId == iv[4][2].getId() || viewId == iv[4][3].getId()) {
                            x -= 4;
                        }
                        // 枠の上と下
                    }else if(viewId == iv[1][0].getId() || viewId == iv[2][0].getId() || viewId == iv[3][0].getId() || viewId == iv[1][4].getId() || viewId == iv[2][4].getId() || viewId == iv[3][4].getId()) {

                        x = 0;
                        y = 0;
                        if (viewId == iv[1][4].getId() || viewId == iv[2][4].getId() || viewId == iv[3][4].getId()) {
                            y += 4;
                        }
                        if (viewId == iv[3][y].getId()) {
                            x += 3;
                        }
                        if (viewId == iv[2][y].getId()) {
                            x += 2;
                        }
                        if (viewId == iv[1][y].getId()) {
                            x ++;
                        }
                        if (viewId == iv[x][y].getId()) {
                            if (status.get(viewId) == 0) {
                                iv[x][y].setImageResource(R.drawable.empty);
                                status.put(iv[x][y].getId(), -1);
                            }else {
                                iv[x][y].setImageResource(R.drawable.circle);
                                status.put(iv[x][y].getId(), 0);
                            }


                            int Id2 = iv[x + 1][y].getId();
                            if (Id2 == iv[x + 1][y].getId()) {
                                if (status.get(Id2) == 0) {
                                    iv[x + 1][y].setImageResource(R.drawable.empty);
                                    status.put(iv[x + 1][y].getId(), -1);
                                } else {
                                    iv[x + 1][y].setImageResource(R.drawable.circle);
                                    status.put(iv[x + 1][y].getId(), 0);
                                }
                            }

                            int Id3 = iv[x - 1][y].getId();
                            if (Id3 == iv[x - 1][y].getId()) {
                                if (status.get(Id3) == 0) {
                                    iv[x - 1][y].setImageResource(R.drawable.empty);
                                    status.put(iv[x - 1][y].getId(), -1);
                                } else {
                                    iv[x - 1][y].setImageResource(R.drawable.circle);
                                    status.put(iv[x - 1][y].getId(), 0);
                                }
                            }
                            if (y == 0) {
                                int Id4 = iv[x][y + 1].getId();
                                if (Id4 == iv[x][y + 1].getId()) {
                                    if (status.get(Id4) == 0) {
                                        iv[x][y + 1].setImageResource(R.drawable.empty);
                                        status.put(iv[x][y + 1].getId(), -1);
                                    } else {
                                        iv[x][y + 1].setImageResource(R.drawable.circle);
                                        status.put(iv[x][y + 1].getId(), 0);
                                    }
                                }
                            } else if (y == 4) {
                                int Id4 = iv[x][y - 1].getId();
                                if (Id4 == iv[x][y - 1].getId()) {
                                    if (status.get(Id4) == 0) {
                                        iv[x][y - 1].setImageResource(R.drawable.empty);
                                        status.put(iv[x][y - 1].getId(), -1);
                                    } else {
                                        iv[x][y - 1].setImageResource(R.drawable.circle);
                                        status.put(iv[x][y - 1].getId(), 0);
                                    }
                                }
                            }

                            y = 0;
                            x = 0;
                        }
                        // others
                    }else if(viewId == iv[1][1].getId() || viewId == iv[1][2].getId() || viewId == iv[1][3].getId() ||
                            viewId == iv[2][1].getId() || viewId == iv[2][2].getId() || viewId == iv[2][3].getId() ||
                            viewId == iv[3][1].getId() || viewId == iv[3][2].getId() || viewId == iv[3][3].getId() ){
                        x = 0;
                        y = 0;
                        if (viewId == iv[1][1].getId() || viewId == iv[1][2].getId() || viewId == iv[1][3].getId()) {
                            x ++;
                        }
                        if (viewId == iv[2][1].getId() || viewId == iv[2][2].getId() || viewId == iv[2][3].getId()) {
                            x += 2;
                        }
                        if (viewId == iv[3][1].getId() || viewId == iv[3][2].getId() || viewId == iv[3][3].getId()) {
                            x += 3;
                        }
                        if (viewId == iv[x][1].getId()) {
                            y++;
                        }
                        if (viewId == iv[x][2].getId()) {
                            y += 2;
                        }
                        if (viewId == iv[x][3].getId()) {
                            y += 3;
                        }

                        if (viewId == iv[x][y].getId()) {
                            if (status.get(viewId) == 0) {
                                iv[x][y].setImageResource(R.drawable.empty);
                                status.put(iv[x][y].getId(), -1);
                            } else {
                                iv[x][y].setImageResource(R.drawable.circle);
                                status.put(iv[x][y].getId(), 0);
                            }

                            int Id2 = iv[x + 1][y].getId();
                            if (Id2 == iv[x + 1][y].getId()) {
                                if (status.get(Id2) == 0) {
                                    iv[x + 1][y].setImageResource(R.drawable.empty);
                                    status.put(iv[x + 1][y].getId(), -1);
                                } else {
                                    iv[x + 1][y].setImageResource(R.drawable.circle);
                                    status.put(iv[x + 1][y].getId(), 0);
                                }
                            }

                            int Id3 = iv[x - 1][y].getId();
                            if (Id3 == iv[x - 1][y].getId()) {
                                if (status.get(Id3) == 0) {
                                    iv[x - 1][y].setImageResource(R.drawable.empty);
                                    status.put(iv[x - 1][y].getId(), -1);
                                } else {
                                    iv[x - 1][y].setImageResource(R.drawable.circle);
                                    status.put(iv[x - 1][y].getId(), 0);
                                }
                            }

                            int Id4 = iv[x][y + 1].getId();
                            if (Id4 == iv[x][y + 1].getId()) {
                                if (status.get(Id4) == 0) {
                                    iv[x][y + 1].setImageResource(R.drawable.empty);
                                    status.put(iv[x][y + 1].getId(), -1);
                                } else {
                                    iv[x][y + 1].setImageResource(R.drawable.circle);
                                    status.put(iv[x][y + 1].getId(), 0);
                                }
                            }

                            int Id5 = iv[x][y - 1].getId();
                            if (Id5 == iv[x][y - 1].getId()) {
                                if (status.get(Id5) == 0) {
                                    iv[x][y - 1].setImageResource(R.drawable.empty);
                                    status.put(iv[x][y - 1].getId(), -1);
                                } else {
                                    iv[x][y - 1].setImageResource(R.drawable.circle);
                                    status.put(iv[x][y - 1].getId(), 0);
                                }
                            }

                        }
                        x = 0;
                        y = 0;
                    }

                }


                tv1.setText(k + "回目");
                k++;
            }


        };

        iv[0][0] = (ImageView) findViewById(R.id.imageView00);
        iv[0][1] = (ImageView) findViewById(R.id.imageView01);
        iv[0][2] = (ImageView) findViewById(R.id.imageView02);
        iv[0][3] = (ImageView) findViewById(R.id.imageView03);
        iv[0][4] = (ImageView) findViewById(R.id.imageView04);
        iv[1][0] = (ImageView) findViewById(R.id.imageView10);
        iv[1][1] = (ImageView) findViewById(R.id.imageView11);
        iv[1][2] = (ImageView) findViewById(R.id.imageView12);
        iv[1][3] = (ImageView) findViewById(R.id.imageView13);
        iv[1][4] = (ImageView) findViewById(R.id.imageView14);
        iv[2][0] = (ImageView) findViewById(R.id.imageView20);
        iv[2][1] = (ImageView) findViewById(R.id.imageView21);
        iv[2][2] = (ImageView) findViewById(R.id.imageView22);
        iv[2][3] = (ImageView) findViewById(R.id.imageView23);
        iv[2][4] = (ImageView) findViewById(R.id.imageView24);
        iv[3][0] = (ImageView) findViewById(R.id.imageView30);
        iv[3][1] = (ImageView) findViewById(R.id.imageView31);
        iv[3][2] = (ImageView) findViewById(R.id.imageView32);
        iv[3][3] = (ImageView) findViewById(R.id.imageView33);
        iv[3][4] = (ImageView) findViewById(R.id.imageView34);
        iv[4][0] = (ImageView) findViewById(R.id.imageView40);
        iv[4][1] = (ImageView) findViewById(R.id.imageView41);
        iv[4][2] = (ImageView) findViewById(R.id.imageView42);
        iv[4][3] = (ImageView) findViewById(R.id.imageView43);
        iv[4][4] = (ImageView) findViewById(R.id.imageView44);

        for (int i = 0; i < COL; i++)
        {
            for (int j = 0; j < ROW; j++) {

                iv[i][j].setImageResource(R.drawable.empty);
                status.put(iv[i][j].getId(),-1);
                iv[i][j].setOnClickListener(listener);
            }
        }
    }
}