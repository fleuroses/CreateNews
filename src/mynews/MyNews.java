package mynews;

import lombok.Data;

@Data
public class MyNews {
//    private String status;
//    private String totalResults;
//    private Article[] articles;   // 배열

    private String status;
    private Integer totalResults;
    private Article[] articles;
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Integer getTotalResults() {
        return totalResults;
    }
    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }
    public Article[] getArticles() {
        return articles;
    }
    public void setArticles (Article[] articles) {
        this.articles = articles;
    }

}
