
public abstract class Zaporedje {

    public abstract Integer y(int x);

    public String vNiz(Interval interval) {
        StringBuilder sb = new StringBuilder("[");
        int zacetek = interval.vrniZacetek();
        int konec = interval.vrniKonec();
        boolean prvic = true;
        for (int x = zacetek;  x <= konec;  x++) {
            Integer y = this.y(x);
            if (y != null) {
                if (!prvic) {
                    sb.append(", ");
                }
                prvic = false;
                sb.append(String.format("%d -> %d", x, y));
            }
        }
        sb.append("]");
        return sb.toString();
    }
	

   	public Interval minMax(Interval interval) {
		int a = interval.vrniZacetek();
		int b = interval.vrniKonec();
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;	

		for(int i = a; i <= b; i++) {
			Integer fx = this.y(i);
			
			if(fx == null) continue;
			if(fx < min) min = fx;
			if(fx > max) max = fx;
		}
		
		return new Interval(min, max);
	}

    public boolean jeMonotono(Interval interval) {
        int a = interval.vrniZacetek();
		int b = interval.vrniKonec();
		
		boolean narascajoce = true;
		boolean padajoce = true;
		Integer prejsnafx = null;
		
		for(int i = a; i <= b; i ++) {
			Integer fx = this.y(i);
			
			if(fx == null) continue;
			if(prejsnafx == null) {
				prejsnafx = fx; 
				continue;
			}
			
			if(prejsnafx <= fx) padajoce = false;
			if(prejsnafx >= fx) narascajoce = false;
			prejsnafx = fx;	
		}
		
		return narascajoce || padajoce;
    }

    public Zaporedje vsota(Zaporedje drugo) {
        return new Vsota(this, drugo);
    }

    public Zaporedje inverz(Interval interval) {
		return this.jeMonotono(interval) ? new Inverz(this, interval) : null;
    }
	
}
