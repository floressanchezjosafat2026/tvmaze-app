package com.app.dto.tvwaze;

public class WazeTvSearchResponse {
	
	 private TvMazeShow show;
	 

	public TvMazeShow getShow() {
		return show;
	}

	public void setShow(TvMazeShow show) {
		this.show = show;
	}

	public WazeTvSearchResponse(TvMazeShow show) {
		super();
		this.show = show;
	}
	 
	 
}
