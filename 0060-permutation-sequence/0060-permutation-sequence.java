class Solution {
    public String getPermutation(int n, int k) {

        // 1.karakter her (n-1)! permutasyonda bir değişiyor.
        // Yani örneğin n = 5 dersek, 1. karakter 24 satırda bir değişiyor çünkü (5-1)! = 24
        // Eğer k = 26 ise, bu durumda ilk karakter 2 oluyor çünkü 26 / 24 = 1 (0-index olduğu için)
        // 2. karakter (n-2)! satırda bir değişiyor. Böyle böyle her pozisyondaki karakter hesaplanabilir.
        
        List<Integer> numbers = new ArrayList<>();
        int[] factorial = new int[n + 1];
        StringBuilder result = new StringBuilder();

        // 1'den n'e kadar sayıları listeye ekliyoruz
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }

        // Faktöriyel dizisini oluşturuyoruz: factorial[i] = i!
        factorial[0] = 1;
        for (int i = 1; i <= n; i++) {
            factorial[i] = factorial[i - 1] * i;
        }

        // k sıralama 1-indexli olarak veriliyor, ama biz 0-index kullanacağız
        k--;

        // Her pozisyon için doğru sayıyı seçiyoruz
        for (int i = 1; i <= n; i++) {
            int index = k / factorial[n - i];             // Hangi sayının seçileceğini bul
            result.append(numbers.get(index));            // O sayıyı cevaba ekle
            numbers.remove(index);                        // Kullanılan sayıyı listeden çıkar
            k %= factorial[n - i];                        // K'yı güncelle
        }

        return result.toString();
    }
}
