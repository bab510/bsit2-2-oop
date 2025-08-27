import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        PostManager postManager = new PostManager();

        // Sample data
        String postTitle = "Java Programming Tips";
        int[] interactions = {150, 75, 25};
        String[] hashtags = {"#java", "#coding", "#programming", "#java", "#tips"};
        String[] authors = {"Alice", "Bob", "Alice", "Charlie", "Bob"};

        // Calculate engagement score
        int engagementScore = postManager.calculateEngagement(interactions);
        String category = postManager.getCategoryRating(engagementScore);


        System.out.println("════ Social Media Post Manager ════");
        postManager.displayPostStats(postTitle, engagementScore, category);
        System.out.println();

        ArrayList<String> uniqueHashtags = postManager.manageHashtags(hashtags);
        System.out.println("Unique Hashtags: " + uniqueHashtags);

        HashMap<String, Integer> postEngagement = new HashMap<>();
        postEngagement.put("Advanced java tutorial", 600);
        postEngagement.put("Spring Boot Guide", 700);

        postEngagement.put(postTitle, engagementScore);

        ArrayList<String> posts = new ArrayList<>(postEngagement.keySet());
        LinkedList<String> trendingPosts = postManager.findTrendingPosts(posts, postEngagement);
        System.out.println("Trending Posts: " + trendingPosts);

        LinkedHashSet<String> uniqueAuthors = postManager.getUniqueAuthors(authors);
        System.out.println("Unique Authors: " + uniqueAuthors);
    }
}
