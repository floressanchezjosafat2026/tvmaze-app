package com.app.dto.tvwaze;

import java.util.List;
import java.util.Map;

public class TvMazeShow {

	
	private Long id;
	private String name;
	private String summary;
	private List<String> genres;
	private TvMazeNetwork network;
	private TvMazeWebChannel webChannel;
	private String url;
    private String type;
    private String language;
    private String status;
    private Integer runtime;
    private Integer averageRuntime;
    private String premiered;
    private String ended;
    private String officialSite;
    private Map<String, Object> schedule;
    private Map<String, Object> rating;
    private Double weight;
    private Map<String, Object> dvdCountry;
    private Map<String, Object> externals;
    private Map<String, Object> image;
    private Long updated;
    private Map<String, Object> links;
	
	
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
	
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getRuntime() {
		return runtime;
	}
	public void setRuntime(Integer runtime) {
		this.runtime = runtime;
	}
	public Integer getAverageRuntime() {
		return averageRuntime;
	}
	public void setAverageRuntime(Integer averageRuntime) {
		this.averageRuntime = averageRuntime;
	}
	public String getPremiered() {
		return premiered;
	}
	public void setPremiered(String premiered) {
		this.premiered = premiered;
	}
	public String getEnded() {
		return ended;
	}
	public void setEnded(String ended) {
		this.ended = ended;
	}
	public String getOfficialSite() {
		return officialSite;
	}
	public void setOfficialSite(String officialSite) {
		this.officialSite = officialSite;
	}
	public Map<String, Object> getSchedule() {
		return schedule;
	}
	public void setSchedule(Map<String, Object> schedule) {
		this.schedule = schedule;
	}
	public Map<String, Object> getRating() {
		return rating;
	}
	public void setRating(Map<String, Object> rating) {
		this.rating = rating;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public Map<String, Object> getDvdCountry() {
		return dvdCountry;
	}
	public void setDvdCountry(Map<String, Object> dvdCountry) {
		this.dvdCountry = dvdCountry;
	}
	public Map<String, Object> getExternals() {
		return externals;
	}
	public void setExternals(Map<String, Object> externals) {
		this.externals = externals;
	}
	public Map<String, Object> getImage() {
		return image;
	}
	public void setImage(Map<String, Object> image) {
		this.image = image;
	}
	public Long getUpdated() {
		return updated;
	}
	public void setUpdated(Long updated) {
		this.updated = updated;
	}
	public Map<String, Object> getLinks() {
		return links;
	}
	public void setLinks(Map<String, Object> links) {
		this.links = links;
	}
	

	public TvMazeShow(Long id, String name, String summary, List<String> genres, TvMazeNetwork network,
			TvMazeWebChannel webChannel, String url, String type, String language, String status, Integer runtime,
			Integer averageRuntime, String premiered, String ended, String officialSite, Map<String, Object> schedule,
			Map<String, Object> rating, Double weight, Map<String, Object> dvdCountry, Map<String, Object> externals,
			Map<String, Object> image, Long updated, Map<String, Object> links) {
		super();
		this.id = id;
		this.name = name;
		this.summary = summary;
		this.genres = genres;
		this.network = network;
		this.webChannel = webChannel;
		this.url = url;
		this.type = type;
		this.language = language;
		this.status = status;
		this.runtime = runtime;
		this.averageRuntime = averageRuntime;
		this.premiered = premiered;
		this.ended = ended;
		this.officialSite = officialSite;
		this.schedule = schedule;
		this.rating = rating;
		this.weight = weight;
		this.dvdCountry = dvdCountry;
		this.externals = externals;
		this.image = image;
		this.updated = updated;
		this.links = links;
	}
	
	
}
