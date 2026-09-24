package com.app.dto.tvwaze;

import java.util.List;

public class TvMazeShow {

	
	private Long id;
	private String name;
	private String summary;
	private List<String> genres;
	private TvMazeNetwork network;
	private TvMazeWebChannel webChannel;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public List<String> getGenres() {
		return genres;
	}
	public void setGenres(List<String> genres) {
		this.genres = genres;
	}
	public TvMazeNetwork getNetwork() {
		return network;
	}
	public void setNetwork(TvMazeNetwork network) {
		this.network = network;
	}
	public TvMazeWebChannel getWebChannel() {
		return webChannel;
	}
	public void setWebChannel(TvMazeWebChannel webChannel) {
		this.webChannel = webChannel;
	}
	
	public TvMazeShow(Long id, String name, String summary, List<String> genres, TvMazeNetwork network,
			TvMazeWebChannel webChannel) {
		super();
		this.id = id;
		this.name = name;
		this.summary = summary;
		this.genres = genres;
		this.network = network;
		this.webChannel = webChannel;
	}
	
	
}
