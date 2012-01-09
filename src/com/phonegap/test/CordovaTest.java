package com.phonegap.test;

import com.phonegap.StandAlone;

import android.R;
import android.test.ActivityInstrumentationTestCase2;
import android.view.View;

public class CordovaTest extends ActivityInstrumentationTestCase2<StandAlone> {
	
	private StandAlone testActivity;
	private View testView;
	private String rString;

	public CordovaTest() {
		super("com.phonegap",StandAlone.class);
	}
	
	protected void setUp() throws Exception{
		super.setUp();
		testActivity = this.getActivity();
		testView = (View) testActivity.findViewById(android.R.id.content);
	}
	
	public void testPreconditions(){
		assertNotNull(testView);
	}
	
}
