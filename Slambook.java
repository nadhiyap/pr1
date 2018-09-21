package com.example.slambookfriendsforever;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    t=(TextView) findViewById(R.id.textView1);
    Window w=getWindow();
    w.setTitle("SlamBook FriendsForever");
    t.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent i=new Intent(getApplicationContext(),Sec.class);
			startActivity(i);
			
		}
	});
    
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
package com.example.slambookfriendsforever;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class Sec extends Activity {

	TextView t;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sec);
		t=(TextView) findViewById(R.id.textView1);
		Window w=getWindow();
	    w.setTitle("SlamBook FriendsForever");
		t.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(getApplicationContext(),Third.class);
				startActivity(i);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sec, menu);
		return true;
	}

}
package com.example.slambookfriendsforever;


import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Third extends Activity {
	EditText e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13,e14,e15;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
	
	TextView t1,t2;
	SQLiteDatabase db;
	Cursor c;
	Boolean isETempty;
	int N;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_third);
		t1=(TextView) findViewById(R.id.textView16);
		t2=(TextView) findViewById(R.id.textView17);
	    
		e1=(EditText) findViewById(R.id.editText1);
		e2=(EditText) findViewById(R.id.editText2);
		e3=(EditText) findViewById(R.id.editText3);
		e4=(EditText) findViewById(R.id.editText4);
		e5=(EditText) findViewById(R.id.editText5);
		e6=(EditText) findViewById(R.id.editText6);
		e7=(EditText) findViewById(R.id.editText7);
		e8=(EditText) findViewById(R.id.editText8);
		e9=(EditText) findViewById(R.id.editText9);
		e10=(EditText) findViewById(R.id.editText10);
		e11=(EditText) findViewById(R.id.editText11);
		e12=(EditText) findViewById(R.id.editText12);
		e13=(EditText) findViewById(R.id.editText13);
		e14=(EditText) findViewById(R.id.editText14);
		e15=(EditText) findViewById(R.id.editText15);
		b1=(Button) findViewById(R.id.button1);
		b2=(Button) findViewById(R.id.button2);
		b3=(Button) findViewById(R.id.button3);
		b4=(Button) findViewById(R.id.button4);
		b5=(Button) findViewById(R.id.button5);
		b6=(Button) findViewById(R.id.button6);
		b7=(Button) findViewById(R.id.button7);
		b8=(Button) findViewById(R.id.button8);
		b9=(Button) findViewById(R.id.button9);
		b10=(Button) findViewById(R.id.button10);
		
		db=openOrCreateDatabase("SAMPLE", MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS Slam(Id INTEGER NOT NULL,Name VARCHAR(25),e3 VARCHAR(25),e4 VARCHAR(25),e5 VARCHAR(25),e6 VARCHAR(25),e7 VARCHAR(25),e8 VARCHAR(25),e9 VARCHAR(25),e10 VARCHAR(25),e11 VARCHAR(25),e12 VARCHAR(25),e13 VARCHAR(25),e14 VARCHAR(25),e15 VARCHAR(25))");
        c=db.rawQuery("SELECT * FROM Slam", null);
        
        t1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String s=e3.getText().toString();
				Intent i=new Intent(getApplicationContext(),Fourth.class);
				i.putExtra("name",s);
				startActivity(i);
			}
		});
        
        t2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent();
				String mob_no=e3.getText().toString();
				i.setAction(Intent.ACTION_CALL);
				Uri u=Uri.parse("tel:"+mob_no);
				i.setData(u);
				startActivity(i);
				
			}
		});
        
        
        b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				clear();
				c.moveToLast();
				e1.requestFocus();
				
			}
		});

		b10.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				clear();
			}

			
		});
		
		b6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String s1=e1.getText().toString();
				String s2=e2.getText().toString();
				String s3=e3.getText().toString();
				String s4=e4.getText().toString();
				String s5=e5.getText().toString();
				String s6=e6.getText().toString();
				String s7=e7.getText().toString();
				String s8=e8.getText().toString();
				String s9=e9.getText().toString();
				String s10=e10.getText().toString();
				String s11=e11.getText().toString();
				String s12=e12.getText().toString();
				String s13=e13.getText().toString();
				String s14=e14.getText().toString();
				String s15=e15.getText().toString();
				isETemptyOrNot(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15);

				if(isETempty==false)
				{
				c.moveToLast();
				String insert="INSERT INTO Slam(Id,Name,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13,e14,e15) VALUES('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"','"+s9+"','"+s10+"','"+s11+"','"+s12+"','"+s13+"','"+s14+"','"+s15+"')";
				db.execSQL(insert);
				Toast.makeText(getApplicationContext(), "Data Inserted Successfully", Toast.LENGTH_LONG).show();
				c=db.rawQuery("SELECT * FROM Slam", null);
				clear();
				c.moveToNext();
				e1.requestFocus();
				}
				else
				{
				Toast.makeText(getApplicationContext(), "please fill all the fields", Toast.LENGTH_LONG).show();
				clear();
				e1.requestFocus();
				}


				
			}
		});
		b7.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				String CSId=e1.getText().toString();
				int sid=Integer.parseInt(CSId);
				db.execSQL("DELETE FROM Slam WHERE Id="+ sid +"");
				Toast.makeText(getApplicationContext(), "Data Deleted Successfully", Toast.LENGTH_LONG).show();
				    c=db.rawQuery("SELECT * FROM Slam", null);
				    clear();
				
			}
		});
		
		b8.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String s1=e1.getText().toString();
				String s2=e2.getText().toString();
				String s3=e3.getText().toString();
				String s4=e4.getText().toString();
				String s5=e5.getText().toString();
				String s6=e6.getText().toString();
				String s7=e7.getText().toString();
				String s8=e8.getText().toString();
				String s9=e9.getText().toString();
				String s10=e10.getText().toString();
				String s11=e11.getText().toString();
				String s12=e12.getText().toString();
				String s13=e13.getText().toString();
				String s14=e14.getText().toString();
				String s15=e15.getText().toString();
				String CSId=e1.getText().toString();
				int sid=Integer.parseInt(CSId);
				isETemptyOrNot(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15);

				if(isETempty==false)
				{
					db.execSQL("UPDATE Slam SET Id='"+s1+"', Name='"+ s2 +"', e3='"+ s3 + "', e4='"+ s4 + "', e5='"+ s5 + "', e6='"+ s6 + "', e7='"+ s7 + "', e8='"+ s8 + "', e9='"+ s9 + "', e10='"+ s10 + "', e11='"+ s11 + "', e12='"+ s12 + "', e13='"+ s13 + "', e14='"+ s14 + "', e15='"+ s15 + "'      ");
					c=db.rawQuery("SELECT * FROM Slam", null);
					c.moveToPosition(sid);

					Toast.makeText(getApplicationContext(), "Data Updated Successfully", Toast.LENGTH_LONG).show();

				}
				else
				{
				Toast.makeText(getApplicationContext(), "please fill all the fields", Toast.LENGTH_LONG).show();
				clear();
				e1.requestFocus();
				}



				
			}
		});
		b9.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String CSId=e1.getText().toString();
				int sid=Integer.parseInt(CSId);

				c=db.rawQuery("SELECT * FROM Slam WHERE Id="+ sid +"",null);
				c.moveToFirst();
				ShowRecords();

				
			}
		});
		b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				c.moveToFirst();
			    ShowRecords();

			}
		});
		b5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				c.moveToLast();
				ShowRecords();

			}
		});
		b3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				c.moveToPrevious();
				if(c.isBeforeFirst())
				{
				c.moveToLast();
				}
				ShowRecords();
				
			}
		});
		b4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				c.moveToNext();
				if(c.isAfterLast())
				{
				c.moveToFirst();
				}
				ShowRecords();

			}
		});
	}
	public void clear() {
		// TODO Auto-generated method stub
		e1.getText().clear();
		e2.getText().clear();
		e3.getText().clear();
		e4.getText().clear();
		e5.getText().clear();
		e6.getText().clear();
		e7.getText().clear();
		e8.getText().clear();
		e9.getText().clear();
		e10.getText().clear();
		e11.getText().clear();
		e12.getText().clear();
		e13.getText().clear();
		e14.getText().clear();
		e15.getText().clear();
		e1.requestFocus();	
	}

	public void isETemptyOrNot(String s1,String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9, String s10, String s11, String s12, String s13, String s14, String s15) {
		// TODO Auto-generated method stub

		if(TextUtils.isEmpty(s1)||TextUtils.isEmpty(s2)||TextUtils.isEmpty(s3)||TextUtils.isEmpty(s4)||TextUtils.isEmpty(s5)||TextUtils.isEmpty(s6)||TextUtils.isEmpty(s7)||TextUtils.isEmpty(s8)||TextUtils.isEmpty(s9)||TextUtils.isEmpty(s10)||TextUtils.isEmpty(s11)||TextUtils.isEmpty(s12)||TextUtils.isEmpty(s13)||TextUtils.isEmpty(s14)||TextUtils.isEmpty(s15))
		{
		isETempty=true;
		}
		else
		{
		isETempty=false;
		}
		  }
	public void ShowRecords() {
		// TODO Auto-generated method stub

		e1.setText(c.getString(0).toString());
		e2.setText(c.getString(1).toString());
		e3.setText(c.getString(2).toString());
		e4.setText(c.getString(3).toString());
		e5.setText(c.getString(4).toString());
		e6.setText(c.getString(5).toString());
		e7.setText(c.getString(6).toString());
		e8.setText(c.getString(7).toString());
		e9.setText(c.getString(8).toString());
		e10.setText(c.getString(9).toString());
		e11.setText(c.getString(10).toString());
		e12.setText(c.getString(11).toString());
		e13.setText(c.getString(12).toString());
		e14.setText(c.getString(13).toString());
		e15.setText(c.getString(14).toString());

		}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.third, menu);
		return true;
	}

}
package com.example.slambookfriendsforever;

import android.os.Bundle;
import android.app.Activity;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Fourth extends Activity {
EditText e1,e2;
Button b1;
SmsManager sm;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fourth);
		e1=(EditText) findViewById(R.id.editText1);
		e2=(EditText) findViewById(R.id.editText2);
		b1=(Button) findViewById(R.id.button1);
		Bundle b=new Bundle();
		b=getIntent().getExtras();
		String t=b.getString("name");
		e1.setText(t);
		
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				sendSMS();
				
			}

			private void sendSMS() {
				// TODO Auto-generated method stub
				String a=e1.getText().toString();
				String b=e2.getText().toString();
				sm=SmsManager.getDefault();
				sm.sendTextMessage(a, null, b, null, null);
				Toast.makeText(getApplicationContext(), "Message sent",Toast.LENGTH_LONG).show();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.fourth, menu);
		return true;
	}

}
