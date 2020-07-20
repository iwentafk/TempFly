package moneybags.tempfly.aesthetic;

import org.bukkit.entity.Player;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import moneybags.tempfly.TempFly;
import moneybags.tempfly.fly.FlyHandle;
import moneybags.tempfly.fly.FlyHandle.Placeholder;

public class ClipAPI {
	
	public static void initialize() {
		new PlaceHolders().register();
	}
	
	public static class PlaceHolders extends PlaceholderExpansion {
		
		@Override
		public boolean persist() {
			return true;
		}
		
	    @Override
	    public boolean canRegister(){
	        return true;
	    }
		
		@Override
		public String getAuthor() {
			return "ChiefMoneyBags";
		}

		@Override
		public String getIdentifier() {
			return "tempfly";
		}

		@Override
		public String getVersion() {
			return TempFly.getInstance().getDescription().getVersion();
		}
		
		@Override
		public String onPlaceholderRequest(Player p, String identifier) {
			if (p == null) {
				return null;
			}
			if (identifier.equals("time-formatted")) {
				return FlyHandle.getPlaceHolder(p, Placeholder.TIME_FORMATTED);
			}
			if (identifier.equals("time-days")) {
				return FlyHandle.getPlaceHolder(p, Placeholder.TIME_DAYS);
		    }
			if (identifier.equals("time-hours")) {
				return FlyHandle.getPlaceHolder(p, Placeholder.TIME_HOURS);
		    }
			if (identifier.equals("time-minutes")) {
				return FlyHandle.getPlaceHolder(p, Placeholder.TIME_MINUTES);
		    }
			if (identifier.equals("time-seconds")) {
				return FlyHandle.getPlaceHolder(p, Placeholder.TIME_SECONDS);
		    }
			return null;
		}
	}
}
