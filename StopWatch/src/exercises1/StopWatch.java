package exercises1;

   class StopWatch {
	/* UML DÝAGRAM
	 * -startTime:long
	 * -endTime:long
	 * +StopWatch()
	 * +start():void
	 * +stop():void
	 * +getStartTime():long
	 * +getEndTime():long
	 * +getElapsedTime():long
	 */

	private long startTime;
	private long endTime;
	public StopWatch() {
		startTime=System.currentTimeMillis();
    }
	public void start() {
		startTime=System.currentTimeMillis();
	}
	public void stop() {
		endTime=System.currentTimeMillis();
	}
	public long getStartTime() {
		return startTime;
		
	}
	public void setStartTime(long startTime) {
		this.startTime=startTime;
	}
	
	public long getEndTime() {
		return endTime;
	}
	public void setEndTime(long endTime) {
		this.endTime=endTime;
		
	}
	
	public long getElapsedTime() {
		return endTime-startTime;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 
	

}
