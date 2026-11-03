package techstore;

import java.util.ArrayList;

public class Stock {
    private ArrayList<Element> articleList;

    public Stock() {
        this.articleList = new ArrayList<Element>();
    }

    public Stock(ArrayList<Element> articleList) {
        this.articleList = articleList;
    }

    public Stock(ArrayList<String> noms, ArrayList<Double> prix, ArrayList<Long> quantites) {
        this.articleList = new ArrayList<Element>();
        for (int i = 0; i < noms.size(); i++) {
            articleList.add(new Element(noms.get(i), prix.get(i), quantites.get(i)));
        }
    }

    public ArrayList<Element> getArticleList() {
        return articleList;
    }

    public int getArticleNb() {
        return articleList.size();
    }

    public void setArticleList(ArrayList<Element> articleList) {
        this.articleList = articleList;
    }

    public void ajouterArticle(Article article, long quantite) {
        articleList.add(new Element(article, quantite));
    }

    public void ajouterArticle(String nom, double prix, long quantite) {
        articleList.add(new Element(nom, prix, quantite));
    }

    public Element trouverArticle(String reference) {
        for (Element e : articleList) {
            if (e.equuals(reference)) {
                return e;
            }
        }
        return null;
    }

    public void modifierArticle(String reference, String nom, double prix, long quantite) {
        Element e = trouverArticle(reference);
        if (e != null) {
            e.modifier(nom, prix, quantite);
        } else {
            System.out.println("Article non trouvé.");
        }
    }

    public void supprimerArticle(String reference) {
        Element e = trouverArticle(reference);
        if (e != null) {
            articleList.remove(e);
        } else {
            System.out.println("Article non trouvé.");
        }
    }

    public void incrementerQuantiteArticle(String reference, long quantite) {
        Element e = trouverArticle(reference);
        if (e != null) {
            e.incrementerQiantite(quantite);
        } else {
            System.out.println("Article non trouvé.");
        }
    }

    public void decrementerQuantiteArticle(String reference, long quantite) {
        Element e = trouverArticle(reference);
        if (e != null) {
            e.decrementerQiantite(quantite);
        } else {
            System.out.println("Article non trouvé.");
        }
    }

    public String toString() {
        String result = "";
        for (Element e : articleList) {
            result += e.toString() + "\n";
        }
        return result;
    }
}