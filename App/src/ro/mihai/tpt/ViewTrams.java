/*
    TimisoaraPublicTransport - display public transport information on your device
    Copyright (C) 2011  Mihai Balint

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>. 
*/
package ro.mihai.tpt;

import ro.mihai.tpt.R;
import ro.mihai.tpt.model.City;
import ro.mihai.tpt.utils.CityActivity;
import ro.mihai.tpt.utils.CityNotLoadedException;

import android.os.Bundle;
import android.view.Window;

public class ViewTrams extends CityActivity {

	/** Called when the activity is first created. */
    @Override
	protected void onCreateCityActivity(Bundle savedInstanceState) throws CityNotLoadedException {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        
    	setContentView(R.layout.list_trams);

    	City c = getCity();
    	findViewById(R.id.bTv1).setOnClickListener(new SelectLinePath(this, ViewTimes.class, c, c.getLine("Tv1")));
    	findViewById(R.id.bTv2).setOnClickListener(new SelectLinePath(this, ViewTimes.class, c, c.getLine("Tv2")));
    	findViewById(R.id.bTv4).setOnClickListener(new SelectLinePath(this, ViewTimes.class, c, c.getLine("Tv4")));
    	findViewById(R.id.bTv5).setOnClickListener(new SelectLinePath(this, ViewTimes.class, c, c.getLine("Tv5")));
    	findViewById(R.id.bTv6).setOnClickListener(new SelectLinePath(this, ViewTimes.class, c, c.getLine("Tv6")));
    	findViewById(R.id.bTv7).setOnClickListener(new SelectLinePath(this, ViewTimes.class, c, c.getLine("Tv7")));
    	findViewById(R.id.bTv8).setOnClickListener(new SelectLinePath(this, ViewTimes.class, c, c.getLine("Tv8")));
    	findViewById(R.id.bTv9).setOnClickListener(new SelectLinePath(this, ViewTimes.class, c, c.getLine("Tv9")));
    	
    }
}