import java.util.*;

public class Main {
    public static void main(String[] args) {
        PostManager postManager = new PostManager();

        // Sample data
        String postTitle = "Java Programming Tips";
        int[] interactions = {150, 75, 25}; // likes, comments, shares
        String[] hashtags = {"#java", "#coding", "#programming", "#java", "#tips"};
        String[] authors = {"Alice", "Bob", "Alice", "Charlie", "Bob"};

        // Calculate engagement score
        int engagementScore = postManager.calculateEngagement(interactions);
        String category = postManager.getCategoryRating(engagementScore);

        // Display post stats
        System.out.println("╔═══════════════════════════ Social Media Post Manager ═════════════════════════════╗");
        postManager.displayPostStats(postTitle, engagementScore, category);

        // Manage hashtags
        ArrayList<String> uniqueHashtags = postManager.manageHashtags(hashtags);
        System.out.println("\nUnique Hashtags: " + uniqueHashtags);

        // Sample post engagement data
        HashMap<String, Integer> postEngagement = new HashMap<>();
        postEngagement.put(postTitle, engagementScore);
        postEngagement.put("Advanced Java Tutorial", 600);
        postEngagement.put("Spring Boot Guide", 700);

        // Find trending posts
        ArrayList<String> posts = new ArrayList<>(postEngagement.keySet());
        LinkedList<String> trendingPosts = postManager.findTrendingPosts(posts, postEngagement);
        System.out.println("Trending Posts: " + trendingPosts);

        // Get unique authors
        HashSet<String> uniqueAuthors = postManager.getUniqueAuthors(authors);
        System.out.println("Unique Authors: " + uniqueAuthors);
    }
}