# Measuring-Image-Similarities Using ORB

This project presents an efficient approach to comparing the visual similarity between images using local feature-based techniques. The core of the project leverages the **ORB (Oriented FAST and Rotated BRIEF)** algorithm for detecting and describing keypoints in images. By matching these features, the system estimates how similar two or more images are.

In addition to ORB, the project incorporates other similarity measures:

- SSIM (Structural Similarity Index): Evaluates perceptual similarity between image structures.
- Pixel Similarity: Measures absolute differences at the pixel level.
- EMD (Earth Mover's Distance): Compares image histograms as distributions.

## Objectives

- Feature extraction using **ORB** (OpenCV)
- Structural similarity calculation (**SSIM**)
- Pixel-level comparison score
- Earth Mover's Distance (histogram comparison)
- Visualization of matching keypoints using ORB

## Technologies Used

- Python
- OpenCV (ORB, Brute Force Matcher)
- Scikit-image (SSIM)
- SciPy (Wasserstein distance)
- ImageIO, NumPy, Pandas
- Matplotlib (for visual match results)
- Jupyter Notebook (for development and demonstration)

## Outcome
- Accurately identifies and scores similarities between image pairs.
- Performs well in both identical and partially similar image tests.
- Visualizes how features align between compared images.
- Summarizing all comparisons and decisions (e.g., highly similar / not similar).
