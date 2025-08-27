import java.util.*;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.HashSet;

public class PostManager {

    public int calculateEngagement(int... interactions) {
        int total = 0;
        for (int interaction : interactions) {
            total += interaction;
        }
        return total;
    }

    public String getCategoryRating(int engagementScore) {
        if (engagementScore >= 1000) {
            return "Viral";
        } else if (engagementScore >= 500) {
            return "Popular";
        } else if (engagementScore >= 100) {
            return "Good";
        } else if (engagementScore >= 50) {
            return "Low";
        } else {
            return "Poor";
        }
    }

    public void displayPostStats(String postTitle, int engagementScore) {
        System.out.println("Post: " + postTitle);
        System.out.println("Engagement Score: " + engagementScore);
    }

    public void displayPostStats(String postTitle, int engagementScore, String category) {
        displayPostStats(postTitle, engagementScore);
        System.out.println("Category: " + category);
    }

    // Returns a list of unique hashtags preserving insertion order
    public ArrayList<String> manageHashtags(String[] hashtags) {
        LinkedHashSet<String> uniqueHashtags = new LinkedHashSet<>();
        Collections.addAll(uniqueHashtags, hashtags);
        return new ArrayList<>(uniqueHashtags);
    }

    public LinkedList<String> findTrendingPosts(ArrayList<String> posts, HashMap<String, Integer> postEngagement) {
        LinkedList<String> trendingPosts = new LinkedList<>();
        for (String post : posts) {
            if (postEngagement.getOrDefault(post, 0) > 500) {
                trendingPosts.add(post);
            }
        }
        return trendingPosts;
    }

    public LinkedHashSet<String> getUniqueAuthors(String... authors) {
        LinkedHashSet<String> uniqueAuthors = new LinkedHashSet<>();
        Collections.addAll(uniqueAuthors, authors);
        return uniqueAuthors;
    }
}
